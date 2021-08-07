package com.zr.class3.model;
//后端-朱子剑
public class FangYuanQQ {
	private String FYQNum;//房源请求编号
	private String FDNum;//房东编号
	private String GLYNum;//管理员编号
	private String FYQCreate;//发起请求时间
	private String FYQExam;//请求审核时间
	private String State;//状态
	public String getFYQNum() {
		return FYQNum;
	}
	public void setFYQNum(String fYQNum) {
		FYQNum = fYQNum;
	}
	public String getFDNum() {
		return FDNum;
	}
	public void setFDNum(String fDNum) {
		FDNum = fDNum;
	}
	public String getGLYNum() {
		return GLYNum;
	}
	public void setGLYNum(String gLYNum) {
		GLYNum = gLYNum;
	}
	public String getFYQCreate() {
		return FYQCreate;
	}
	public void setFYQCreate(String fYQCreate) {
		FYQCreate = fYQCreate;
	}
	public String getFYQExam() {
		return FYQExam;
	}
	public void setFYQExam(String fYQExam) {
		FYQExam = fYQExam;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "FangYuanQQ [FYQNum=" + FYQNum + ", FDNum=" + FDNum + ", GLYNum=" + GLYNum + ", FYQCreate=" + FYQCreate
				+ ", FYQExam=" + FYQExam + ", State=" + State + "]";
	}
	
	
}
