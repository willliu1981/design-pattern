package com.strategy.item;

public class Item {
	private String name;
	private int number;
	private int id;

	public Item() {

	}
	
	public Item(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public Item(int id, int number) {
		this.id = id;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
