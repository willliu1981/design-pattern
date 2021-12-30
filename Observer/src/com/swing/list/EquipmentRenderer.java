package com.swing.list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

import com.emulator.v1.resource.equipment.Equipment;

public class EquipmentRenderer implements ListCellRenderer<Equipment> {

	@Override
	public Component getListCellRendererComponent(
			JList<? extends Equipment> list, Equipment value, int index,
			boolean isSelected, boolean cellHasFocus) {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(new LineBorder(new Color(0, 128, 0)));

		JLabel lblTitle = new JLabel(value.getClass().getSimpleName());
		lblTitle.setForeground(Color.blue);
		panel.add(lblTitle, BorderLayout.NORTH);

		JLabel label = new JLabel(value.getName());
		label.setForeground(Color.black);
		panel.add(label, BorderLayout.CENTER);

		return panel;
	}

}
