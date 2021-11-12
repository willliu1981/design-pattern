package com.strategy.main.tool;

import java.util.List;

import com.strategy.item.Item;

public class ProduceDetail {
	public static String quantityDetail(Item... items) {
		String str = "";
		for (Item item : items) {
			str += String.format("%s %d 個, ", item.getName(), item.getNumber());
		}
		return str;
	}

	public static String quantityDetail(List<Item> items) {
		return quantityDetail(items.stream().toArray(Item[]::new));
	}
}
