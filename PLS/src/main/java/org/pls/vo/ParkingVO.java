package org.pls.vo;

public class ParkingVO {
	private int no;
	private String name;
	private int areaNum;
	private String adr1;
	private String adr2;
	private String adr3;
	private String adr4;
	private int[] arrArea;
	
	public ParkingVO() {
		super();
	}
	
	public ParkingVO(int no, String name, int areaNum, String adr1, String adr2, String adr3, String adr4, int[] arrArea) {
		super();
		this.no = no;
		this.name = name;
		this.areaNum = areaNum;
		this.adr1 = adr1;
		this.adr2 = adr2;
		this.adr3 = adr3;
		this.adr4 = adr4;
		this.arrArea = arrArea;
	}

	public int[] getArrArea() {
		return arrArea;
	}

	public void setArrArea(int[] arrArea) {
		this.arrArea = arrArea;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAreaNum() {
		return areaNum;
	}
	public void setAreaNum(int areaNum) {
		this.areaNum = areaNum;
	}
	public String getAdr1() {
		return adr1;
	}
	public void setAdr1(String adr1) {
		this.adr1 = adr1;
	}
	public String getAdr2() {
		return adr2;
	}
	public void setAdr2(String adr2) {
		this.adr2 = adr2;
	}
	public String getAdr3() {
		return adr3;
	}
	public void setAdr3(String adr3) {
		this.adr3 = adr3;
	}
	public String getAdr4() {
		return adr4;
	}
	public void setAdr4(String adr4) {
		this.adr4 = adr4;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParkingVO [no=");
		builder.append(no);
		builder.append(", name=");
		builder.append(name);
		builder.append(", areaNum=");
		builder.append(areaNum);
		builder.append(", adr1=");
		builder.append(adr1);
		builder.append(", adr2=");
		builder.append(adr2);
		builder.append(", adr3=");
		builder.append(adr3);
		builder.append(", adr4=");
		builder.append(adr4);
		builder.append(", arrArea=");
		builder.append(arrArea);
		builder.append("]");
		return builder.toString();
	}
}
