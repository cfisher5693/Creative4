package controller;

import view.MainScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Computer;
import model.Console;
import model.Mobile;

public class RepairListener implements ActionListener{
	private MainScreen panel;

	public RepairListener(MainScreen panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panel.getAddButton()) {
			int cost = 0;
			String device = (String) panel.getDeviceList().getSelectedItem();
			String service = (String) panel.getServiceList().getSelectedItem();
			String spec = panel.getInputField().getText();
			if(service == "Standard") cost = 100;
			else if(service == "Advanced") cost = 200;
			else if(service == "Premium") cost = 300;
			if(device == "Mobile") {
				panel.getCanvas().getCharges().add(new Mobile(cost, device, service, spec));
			} else if(device == "Computer") {
				panel.getCanvas().getCharges().add(new Computer(cost, device, service, spec));
			} else if(device == "Console") {
				panel.getCanvas().getCharges().add(new Console(cost, device, service, spec));
			}
		} else if(e.getSource() == panel.getClearButton()) {
			panel.getCanvas().getCharges().clear();
			panel.getCanvas().repaint();
		}
	}
}
