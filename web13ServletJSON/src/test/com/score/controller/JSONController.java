package test.com.score.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class JSONController
 */
@WebServlet({ "/json_select.do","/json_select2.do", "/json_insert.do","/json_search.do","/json_search2.do","/json_search3.do" })
public class JSONController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSONController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request,response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		// 1 kim 99 88 77
		// JSONObject >>>> {"num":1,"name":"kim","kor":99,"eng":88,"math":77}
		out.append("Served at:");
		out.append("{");
		out.append("\"num\"");
		out.append("}");
		
		
		
		
		if(request.getServletPath().equals("/json_select.do")){
			out.append("[");
			out.append("{\"num\":1,\"name\":\"kim\",\"kor\":99,\"eng\":88,\"math\":77}");
			out.append(",");
			out.append("{\"num\":1,\"name\":\"kim\",\"kor\":99,\"eng\":88,\"math\":77}");
			out.append("]");
			
		}else if (request.getServletPath().equals("/json_search.do")){
			out.append((CharSequence) out.append("{\"num\":1,\"name\":\"kim\",\"kor\":99,\"eng\":88,\"math\":77}"));
		}else if (request.getServletPath().equals("/json_search2.do")){
			JSONObject jObj = new JSONObject();
			jObj.append("num", 11);
			jObj.append("name", "Lee");
			jObj.append("kor", 11);
			jObj.append("eng", 22);
			jObj.append("math", 33);
			
			out.append(jObj.toString());
		}else if (request.getServletPath().equals("/json_search3.do")){
			ScoreVO vo = new ScoreVO();
			vo.setName("kim");
			JSONObject jObj = new JSONObject(vo);
			out.append(jObj.toString());
		}else if (request.getServletPath().equals("/json_select2.do")){
			ScoreVO vo = new ScoreVO();
			vo.setName("kim");
			JSONObject jObj = new JSONObject(vo);
			
			
			List<ScoreVO> list = new ArrayList<ScoreVO>();
			list.add(vo);
			list.add(vo);
			list.add(vo);
			JSONArray jArray = new JSONArray(list);
			out.append(jArray.toString());
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
