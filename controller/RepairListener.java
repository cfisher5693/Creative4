package controller;

import view.MainScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Computer;
import model.Console;
import model.Mobile;
import model.Payment;

public class RepairListener implements ActionListener{
	private MainScreen panel;
	private double total = 0;
	private String str = "";

	public RepairListener(MainScreen panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		int n = panel.getCanvas().getCharges().size();
		if(e.getSource() == panel.getAddButton()) {
			double cost = 0;
			String device = (String) panel.getDeviceList().getSelectedItem();
			String service = (String) panel.getServiceList().getSelectedItem();
			String spec = panel.getInputField().getText();
			if(service == "Standard") {
				cost = 100.0;
			} else if(service == "Advanced") {
				cost = 200.0;
			} else if(service == "Premium") {
				cost = 300.0;
			}
			total += cost;
			if(device == "Mobile") {
				panel.getCanvas().getCharges().add(new Mobile(cost, device, service, n, spec, total));
			} else if(device == "Computer") {
				panel.getCanvas().getCharges().add(new Computer(cost, device, service, n, spec, total));
			} else if(device == "Console") {
				panel.getCanvas().getCharges().add(new Console(cost, device, service, n, spec, total));
			}
			panel.getCanvas().repaint();
		} else if(e.getSource() == panel.getClearButton()) {
			panel.getCanvas().getCharges().clear();
			str = "";
			panel.getNumField().setText(str);
			panel.getCanvas().repaint();
		} else if(e.getSource() == panel.getEnterButton()) {
			total = total - Double.parseDouble(str);
			if(total < 0) {
				total = 0;
			}
			panel.getCanvas().getCharges().add(new Payment(Double.parseDouble(str), n, total));
			str = "";
			panel.getNumField().setText(str);
			panel.getCanvas().repaint();
		} else {
			str += button.getText();
			panel.getNumField().setText(str);
		}
	}
}
