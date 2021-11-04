package com.strategy.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Car> cars=new ArrayList<>();
		cars.add(new Car(2));
		cars.add(new Car(3));
		
		Car c=cars.stream().filter(x->x.id==2).findAny().get();
		
		System.out.println(cars);
		System.out.println(c);
	}
	
	static class Car{
		int id;
		Car(int id){
			this.id=id;
		}
	}

}
