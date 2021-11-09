package com.strategy.item.defaultitems;

import java.util.ArrayList;
import java.util.List;

import com.strategy.item.Item;

public class DefaultItem {
	static List<Item> items = new ArrayList<>();

	static {
		items.add(new Item(1, "麵粉"));
		items.add(new Item(2, "水"));
		items.add(new Item(3, "麵條"));
		items.add(new Item(4, "鹽"));
		items.add(new Item(10, "輪胎"));
		items.add(new Item(11, "汽車外殼"));
		items.add(new Item(12, "引擎"));
		items.add(new Item(13, "電腦"));
		items.add(new Item(14, "汽車"));
	}

	private static Item getItem(int id) {
		Item item = items.stream().filter(x -> x.getId() == id).findAny()
				.orElse(null);
		return item;
	}

	public static Item getNewItem(int id, int number) {
		Item item = getItem(id);
		Item cloneItem = new Item();
		cloneItem.setId(item.getId());
		cloneItem.setName(item.getName());
		cloneItem.setNumber(number);
		return cloneItem;
	}

}
