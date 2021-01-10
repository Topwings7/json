package com.tj.top.vo;

public class GundamVo {
	
	private int gid;
	private String scale;
	private String type;
	private String model;
	private String name;
	private String img1;
	private String img2;
	private String img3;
	private int stock;
	private int state;
	
	
	public GundamVo() {
	}

	public GundamVo(int gid, String scale, String type, String model, String name, String img1, String img2, String img3, int stock, int state) {
		this.gid = gid;
		this.scale = scale;
		this.type = type;
		this.model = model;
		this.name = name;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.stock = stock;
		this.state = state;
	}
	
	
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "GundamVo [gid=" + gid + ", scale=" + scale + ", type=" + type + ", model=" + model + ", name=" + name
				+ ", img1=" + img1 + ", img2=" + img2 + ", img3=" + img3 + ", stock=" + stock + ", state=" + state
				+ "]";
	}
	
	
}
