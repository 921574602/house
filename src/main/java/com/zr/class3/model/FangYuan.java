package com.zr.class3.model;

public class FangYuan {
	private String FYNum="";  //房东编号
	private String Type="";   //房源类型
	private float FYPri=0;   //房源租金
	private String Style="";  //房源风格
	private String FYStru=""; //户型结构
	private String FYState=""; //房源状态
	private String FYFac="";   //配套设施
	private String FDNum="";
	private String FYProvince="";
	private String FYCity="";
	private String FYStreet="";
	private String FYRegion="";
	private String FYHouseNum="";
	private String FYMea="";
	
	
	
	public String If_Heyue="无";
	public String If_KanFang="无";
	
	
	public String getFYMea() {
		return FYMea;
	}
	public void setFYMea(String fYMea) {
		FYMea = fYMea;
	}
	public String getFYNum() {
		return FYNum;
	}
	public void setFYNum(String fYNum) {
		FYNum = fYNum;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public float getFYPri() {
		return FYPri;
	}
	public void setFYPri(float fYPri) {
		FYPri = fYPri;
	}
	public String getStyle() {
		return Style;
	}
	public void setStyle(String style) {
		Style = style;
	}
	public String getFYStru() {
		return FYStru;
	}
	public void setFYStru(String fYStru) {
		FYStru = fYStru;
	}
	public String getFYState() {
		return FYState;
	}
	public void setFYState(String fYState) {
		FYState = fYState;
	}
	public String getFYFac() {
		return FYFac;
	}
	public void setFYFac(String fYFac) {
		FYFac = fYFac;
	}
	public String getFDNum() {
		return FDNum;
	}
	public void setFDNum(String fDNum) {
		FDNum = fDNum;
	}
	public String getFYProvince() {
		return FYProvince;
	}
	public void setFYProvince(String fYProvince) {
		FYProvince = fYProvince;
	}
	public String getFYCity() {
		return FYCity;
	}
	public void setFYCity(String fYCity) {
		FYCity = fYCity;
	}
	public String getFYStreet() {
		return FYStreet;
	}
	public void setFYStreet(String fYStreet) {
		FYStreet = fYStreet;
	}
	public String getFYRegion() {
		return FYRegion;
	}
	public void setFYRegion(String fYRegion) {
		FYRegion = fYRegion;
	}
	public String getFYHouseNum() {
		return FYHouseNum;
	}
	public void setFYHouseNum(String fYHouseNum) {
		FYHouseNum = fYHouseNum;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FangYuan [FYNum=");
		builder.append(FYNum);
		builder.append(", Type=");
		builder.append(Type);
		builder.append(", FYPri=");
		builder.append(FYPri);
		builder.append(", Style=");
		builder.append(Style);
		builder.append(", FYStru=");
		builder.append(FYStru);
		builder.append(", FYState=");
		builder.append(FYState);
		builder.append(", FYFac=");
		builder.append(FYFac);
		builder.append(", FDNum=");
		builder.append(FDNum);
		builder.append(", FYProvince=");
		builder.append(FYProvince);
		builder.append(", FYCity=");
		builder.append(FYCity);
		builder.append(", FYStreet=");
		builder.append(FYStreet);
		builder.append(", FYRegion=");
		builder.append(FYRegion);
		builder.append(", FYHouseNum=");
		builder.append(FYHouseNum);
		builder.append("]");
		return builder.toString();
	}	
}
