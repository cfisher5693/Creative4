package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Console extends Repair {
	private String manufacturer;

	public Console(double cost, String device, String service, int n, String manufacturer, double total) {
		super(cost, device, service, n, total);
		this.manufacturer = manufacturer;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.yellow);
		String str = manufacturer + "(" + getDevice() + "), " + getService() + ", Cost: " + getCost() + "........................Total: " + getTotal();
		g2.drawString(str, 30, 15*getN()+15);
	}
}
