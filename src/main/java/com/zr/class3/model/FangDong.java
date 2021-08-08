package com.zr.class3.model;

public class FangDong {
	private String FDNum;  //房东编号
	private String FDName; //房东姓名
	private String Sex;    //房东性别
	private String FDAdress;  //房东住址
	private String FDEmail;   //房东邮箱
	private int FDTel;        //房东电话
	private String FDEdu;     //房东学历
	private String FDJob;     //房东职业
	private String FDIdnum;   //房东身份证号码
	
	
	
	
	
	
	
	private String FYQQ;
	private String HeYueQueRen;
	
	public String getFYQQ() {
		return FYQQ;
	}
	public void setFYQQ(String fYQQ) {
		FYQQ = fYQQ;
	}
	public String getHeYueQueRen() {
		return HeYueQueRen;
	}
	public void setHeYueQueRen(String heYueQueRen) {
		HeYueQueRen = heYueQueRen;
	}
	public String getFDNum() {
		return FDNum;
	}
	public void setFDNum(String fDNum) {
		FDNum = fDNum;
	}
	public String getFDName() {
		return FDName;
	}
	public void setFDName(String fDName) {
		FDName = fDName;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getFDAdress() {
		return FDAdress;
	}
	public void setFDAdress(String fDAdress) {
		FDAdress = fDAdress;
	}
	public String getFDEmail() {
		return FDEmail;
	}
	public void setFDEmail(String fDEmail) {
		FDEmail = fDEmail;
	}
	public int getFDTel() {
		return FDTel;
	}
	public void setFDTel(int fDTel) {
		FDTel = fDTel;
	}
	public String getFDEdu() {
		return FDEdu;
	}
	public void setFDEdu(String fDEdu) {
		FDEdu = fDEdu;
	}
	public String getFDJob() {
		return FDJob;
	}
	public void setFDJob(String fDJob) {
		FDJob = fDJob;
	}
	public String getFDIdnum() {
		return FDIdnum;
	}
	public void setFDIdnum(String fDIdnum) {
		FDIdnum = fDIdnum;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FangDong [FDNum=");
		builder.append(FDNum);
		builder.append(", FDName=");
		builder.append(FDName);
		builder.append(", Sex=");
		builder.append(Sex);
		builder.append(", FDAdress=");
		builder.append(FDAdress);
		builder.append(", FDEmail=");
		builder.append(FDEmail);
		builder.append(", FDTel=");
		builder.append(FDTel);
		builder.append(", FDEdu=");
		builder.append(FDEdu);
		builder.append(", FDJob=");
		builder.append(FDJob);
		builder.append(", FDIdnum=");
		builder.append(FDIdnum);
		builder.append(", FYQQ=");
		builder.append(FYQQ);
		builder.append(", HeYueQueRen=");
		builder.append(HeYueQueRen);
		builder.append("]");
		return builder.toString();
	}

	
}
