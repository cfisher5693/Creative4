package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Mobile extends Repair {
	private String model;

	public Mobile(double cost, String device, String service, int n, String model, double total) {
		super(cost, device, service, n, total);
		this.model = model;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.yellow);
		String str = model + "(" + getDevice() + "), " + getService() + ", Cost: " + getCost() + "........................Total: " + getTotal();
		g2.drawString(str, 30, 15*getN()+15);
	}
}
