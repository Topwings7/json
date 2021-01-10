package com.tj.top.bonus;

public class GunPra {
	
	private final String scale;
	private final String model;
	private final String name;
	private final boolean sold;
	private final int price;
	private final Type type;
	

	public GunPra(String scale, String model, String name, boolean sold, int price, Type type) {
		super();
		this.scale = scale;
		this.model = model;
		this.name = name;
		this.sold = sold;
		this.price = price;
		this.type = type;
	}
	
	public String getScale() {
		return scale;
	}

	public String getModel() {
		return model;
	}

	public String getName() {
		return name;
	}

	public boolean isSold() {
		return sold;
	}

	public int getPrice() {
		return price;
	}

	public Type getType() {
		return type;
	}


	public enum Type {
		FEDERATION, 
		ZEON,
		AEUG,
		OZ
		
	}
	
	@Override
	public String toString() {
		return "{\"model\":\""+model+"\",\"name\":\""+name+"\"}\n";
	}
}
