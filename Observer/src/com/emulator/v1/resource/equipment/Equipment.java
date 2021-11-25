package com.emulator.v1.resource.equipment;

import java.util.ArrayList;
import java.util.List;

import com.emulator.v1.resource.item.Item;

public class Equipment {
	private String name;
	private List<Item> inputItems =new ArrayList<>();
	private List<Item> stoveItems =new ArrayList<>();

	public Equipment() {
	}

	public Equipment(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
