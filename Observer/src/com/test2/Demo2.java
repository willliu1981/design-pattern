package com.test2;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.test2.ProductV2.State;

public class Demo2 {
	public static void main(String[] ss) {
		ArrayList<ProductV2> list = new ArrayList<>();

		ProductV2 p1 = new ProductV2();
		p1.setP_name("Apple");
		p1.setP_num(5);
		list.add(p1);

		State s1 = new State();
		s1.setP_orign("台灣");
		s1.setP_isfresh(true);
		p1.add(s1);

		State s2 = new State();
		s2.setP_orign("美國");
		s2.setP_isfresh(false);
		p1.add(s2);

		Gson g = new Gson();
		String json = g.toJson(list);

		System.out.println("test produce v2");
		System.out.println(json);

	}
}
