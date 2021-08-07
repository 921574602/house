package com.zr.class3.model;

import java.util.List;

public class Menu {
	
	private int id;
	private String title;
	private String icon;
	private String href;
	private int parentid;
	private List<Menu> children;
	
	
	public List<Menu> getChildren() {
		return children;
	}
	public void setChildren(List<Menu> children) {
		this.children = children;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", icon=");
		builder.append(icon);
		builder.append(", href=");
		builder.append(href);
		builder.append(", parentid=");
		builder.append(parentid);
		builder.append(", children=");
		builder.append(children);
		builder.append("]");
		return builder.toString();
	}
	
}
