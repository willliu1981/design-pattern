package com.strategy.main.exception;

import java.util.Arrays;
import java.util.List;

import com.strategy.item.Item;

public class ProduceErrorException extends RuntimeException {

	public ProduceErrorException() {
		super("生產失敗");
	}

	public ProduceErrorException(List<Item> items) {
		super("生產失敗:" + msg(items));
	}

	public ProduceErrorException(Item... items) {
		this(Arrays.asList(items));
	}

	private static String msg(List<Item> items) {
		String str = "";
		for (Item item : items) {
			str += String.format("%s %d 個, ", item.getName(), item.getNumber());
		}
		return str;
	}
}
