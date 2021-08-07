package com.zr.class3.model;
//后端-朱子剑
public class FangDongQQ {
	private String FDQNum;//房东请求编号
	private String ZHNum;//租户编号
	private String GLYNum;//管理员编号
	private String FDQCreate;//发起请求时间
	private String FDQExam;//请求审核时间
	private String State;//状态
	public String getFDQNum() {
		return FDQNum;
	}
	public void setFDQNum(String fDQNum) {
		FDQNum = fDQNum;
	}
	public String getZHNum() {
		return ZHNum;
	}
	public void setZHNum(String zHNum) {
		ZHNum = zHNum;
	}
	public String getGLYNum() {
		return GLYNum;
	}
	public void setGLYNum(String gLYNum) {
		GLYNum = gLYNum;
	}
	public String getFDQCreate() {
		return FDQCreate;
	}
	public void setFDQCreate(String fDQCreate) {
		FDQCreate = fDQCreate;
	}
	public String getFDQExam() {
		return FDQExam;
	}
	public void setFDQExam(String fDQExam) {
		FDQExam = fDQExam;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "FangDongQQ [FDQNum=" + FDQNum + ", ZHNum=" + ZHNum + ", GLYNum=" + GLYNum + ", FDQCreate=" + FDQCreate
				+ ", FDQExam=" + FDQExam + ", State=" + State + "]";
	}
	
	
}
