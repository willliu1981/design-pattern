package com.test.test3;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		JFrame jframe =new JFrame();
		JLabel lbl=new JLabel("Hello");
		jframe.add(lbl);
		jframe.setBounds(100, 100, 300, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}

}
