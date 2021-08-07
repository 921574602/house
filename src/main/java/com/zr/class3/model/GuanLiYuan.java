package com.zr.class3.model;

public class GuanLiYuan {
	private String GLYNum;  //管理员编号
	private String GLYName; //管理员姓名
	private String Sex;     //管理员性别
	private int GLYTel;     //管理员电话
	private String GLYEmail; //管理员邮箱
	private String GLYId;    //管理员身份证号
	private String GLYacc;   //管理员账号
	private String GLYpass;  //管理员密码
	@Override
	public String toString() {
		return "GuanLiYuan [GLYNum=" + GLYNum + ", GLYName=" + GLYName + ", Sex=" + Sex + ", GLYTel=" + GLYTel
				+ ", GLYEmail=" + GLYEmail + ", GLYId=" + GLYId + ", GLYacc=" + GLYacc + ", GLYpass=" + GLYpass + "]";
	}
	public String getGLYNum() {
		return GLYNum;
	}
	public void setGLYNum(String gLYNum) {
		GLYNum = gLYNum;
	}
	public String getGLYName() {
		return GLYName;
	}
	public void setGLYName(String gLYName) {
		GLYName = gLYName;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getGLYTel() {
		return GLYTel;
	}
	public void setGLYTel(int gLYTel) {
		GLYTel = gLYTel;
	}
	public String getGLYEmail() {
		return GLYEmail;
	}
	public void setGLYEmail(String gLYEmail) {
		GLYEmail = gLYEmail;
	}
	public String getGLYId() {
		return GLYId;
	}
	public void setGLYId(String gLYId) {
		GLYId = gLYId;
	}
	public String getGLYacc() {
		return GLYacc;
	}
	public void setGLYacc(String gLYacc) {
		GLYacc = gLYacc;
	}
	public String getGLYpass() {
		return GLYpass;
	}
	public void setGLYpass(String gLYpass) {
		GLYpass = gLYpass;
	}
}
