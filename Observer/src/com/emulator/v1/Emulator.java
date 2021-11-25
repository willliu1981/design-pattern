package com.emulator.v1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.emulator.v1.resource.equipment.MiningMachine;
import com.emulator.v1.resource.equipment.ProcessingMachine;
import com.swing.list.EquipmentRenderer;
import com.test.MyModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Emulator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emulator frame = new Emulator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the frame.
	 */
	public Emulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		panel.add(list, BorderLayout.WEST);
		
		MyModel model=new MyModel();
		list.setModel(model);
		MiningMachine m1=new MiningMachine("mine 1");
		ProcessingMachine m2=new ProcessingMachine("process 1");
		model.addData(m1);
		model.addData(m2);
		
		list.setCellRenderer(new EquipmentRenderer());
		
		
	}

}
