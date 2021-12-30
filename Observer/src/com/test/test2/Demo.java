package com.test.test2;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.test.test2.ProductV2.State;

public class Demo {
	public static void main(String[] ss) {
		ArrayList<ProductV1> list =new ArrayList<>();
		
		ProductV1 p1=new ProductV1();
		p1.setP_name("Apple");
		p1.setP_num(5);
		p1.setP_orign("台灣");
		p1.setP_isfresh(true);
		list.add(p1);
		
		ProductV1 p2=new ProductV1();
		p2.setP_name("Apple");
		p2.setP_num(5);
		p2.setP_orign("美國");
		p2.setP_isfresh(false);
		list.add(p2);
		
		
		Gson g=new Gson();
		String json=g.toJson(list);
		
		System.out.println("test produce v1");
		System.out.println(json);
		
		
		
		
		
	}
}
