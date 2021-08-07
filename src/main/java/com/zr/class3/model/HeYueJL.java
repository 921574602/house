package com.zr.class3.model;
//后端-朱子剑
public class HeYueJL {
	private String HYNum;//合约编号
	private String ZHNum;//租户编号
	private String FYNum;//房源编号
	private String HYJCreate;//合约建立发起时间
	private String HYJOver;//合约创建完成时间
	public String getHYNum() {
		return HYNum;
	}
	public void setHYNum(String hYNum) {
		HYNum = hYNum;
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
	public String getHYJCreate() {
		return HYJCreate;
	}
	public void setHYJCreate(String hYJCreate) {
		HYJCreate = hYJCreate;
	}
	public String getHYJOver() {
		return HYJOver;
	}
	public void setHYJOver(String hYJOver) {
		HYJOver = hYJOver;
	}
	@Override
	public String toString() {
		return "HeYueJL [HYNum=" + HYNum + ", ZHNum=" + ZHNum + ", FYNum=" + FYNum + ", HYJCreate=" + HYJCreate
				+ ", HYJOver=" + HYJOver + "]";
	}
	
	
}
