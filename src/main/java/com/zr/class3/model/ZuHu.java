package com.zr.class3.model;

public class ZuHu {
	private String ZHNum;  //租户编号
	private String ZHName; //租户姓名 
	private int ZHTel;     //租户电话
	private String ZHEdu;  //租户学历
	private String ZHJob;  //租户职业
	private String Sex;    //租户性别
	public String getZHNum() {
		return ZHNum;
	}
	public void setZHNum(String zHNum) {
		ZHNum = zHNum;
	}
	public String getZHName() {
		return ZHName;
	}
	public void setZHName(String zHName) {
		ZHName = zHName;
	}
	public int getZHTel() {
		return ZHTel;
	}
	public void setZHTel(int zHTel) {
		ZHTel = zHTel;
	}
	public String getZHEdu() {
		return ZHEdu;
	}
	public void setZHEdu(String zHEdu) {
		ZHEdu = zHEdu;
	}
	public String getZHJob() {
		return ZHJob;
	}
	public void setZHJob(String zHJob) {
		ZHJob = zHJob;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	@Override
	public String toString() {
		return "ZuHu [ZHNum=" + ZHNum + ", ZHName=" + ZHName + ", ZHTel=" + ZHTel + ", ZHEdu=" + ZHEdu + ", ZHJob="
				+ ZHJob + ", Sex=" + Sex + "]";
	}
	
}
