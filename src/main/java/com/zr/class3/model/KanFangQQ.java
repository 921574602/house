package com.zr.class3.model;
//后端-朱子剑
public class KanFangQQ {
	private String KFNum;//看房请求编号
	private String ZHNum;//租户编号
	private String FYNum;//房源编号
	private String KFTime;//租客看房日期
	private String KFCreate;//发起请求时间
	private String KFExam;//请求审核时间
	private String State;//状态
	public String getKFNum() {
		return KFNum;
	}
	public void setKFNum(String kFNum) {
		KFNum = kFNum;
	}
	public String getZHNum() {
		return ZHNum;
	}
	public void setZHNum(String zHNum) {
		ZHNum = zHNum;
	}
	public String getFYNum() {
		return FYNum;
	}
	public void setFYNum(String fYNum) {
		FYNum = fYNum;
	}
	public String getKFTime() {
		return KFTime;
	}
	public void setKFTime(String kFTime) {
		KFTime = kFTime;
	}
	public String getKFCreate() {
		return KFCreate;
	}
	public void setKFCreate(String kFCreate) {
		KFCreate = kFCreate;
	}
	public String getKFExam() {
		return KFExam;
	}
	public void setKFExam(String kFExam) {
		KFExam = kFExam;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "KanFangQQ [KFNum=" + KFNum + ", ZHNum=" + ZHNum + ", FYNum=" + FYNum + ", KFTime=" + KFTime
				+ ", KFCreate=" + KFCreate + ", KFExam=" + KFExam + ", State=" + State + "]";
	}
	
	
}
