package com.zr.class3.model;
//后端-朱子剑
public class HeYue {
	private String HYNum;//合约编号
	private String FYNum;//房源编号
	private String ZHNum;//租户编号
	private String GLYNum;//管理员编号
	private String HYCreate;//合约审核发起时间
	private String HYExam;//合约审核时间
	private String HYOver;//合约过期时间
	private String State;//状态
	public String getHYNum() {
		return HYNum;
	}
	public void setHYNum(String hYNum) {
		HYNum = hYNum;
	}
	public String getFYNum() {
		return FYNum;
	}
	public void setFYNum(String fYNum) {
		FYNum = fYNum;
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
	public String getHYCreate() {
		return HYCreate;
	}
	public void setHYCreate(String hYCreate) {
		HYCreate = hYCreate;
	}
	public String getHYExam() {
		return HYExam;
	}
	public void setHYExam(String hYExam) {
		HYExam = hYExam;
	}
	public String getHYOver() {
		return HYOver;
	}
	public void setHYOver(String hYOver) {
		HYOver = hYOver;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "HeYue [HYNum=" + HYNum + ", FYNum=" + FYNum + ", ZHNum=" + ZHNum + ", GLYNum=" + GLYNum + ", HYCreate="
				+ HYCreate + ", HYExam=" + HYExam + ", HYOver=" + HYOver + ", State=" + State + "]";
	}
	
	
	
}