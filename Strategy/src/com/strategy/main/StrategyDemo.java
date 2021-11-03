package com.strategy.main;

import com.strategy.factory.NoodleFactory;
import com.strategy.item.Item;
import com.strategy.recipe.NoodleRecipe;

public class StrategyDemo {
	public static void main(String[] s) {
		//System.out.println("test");
		
		Item flour =new Item();
		flour.setName("麵粉");
		flour.setId(1);
		flour.setNumber(100);
		
		Item water =new Item();
		water.setName("水");
		water.setId(2);
		water.setNumber(100);
		
		NoodleFactory factory=new NoodleFactory();
		factory.setRecipe(new NoodleRecipe());
		factory.produce(flour,water);
		
	}
}
