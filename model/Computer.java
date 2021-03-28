package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Computer extends Repair {
	private String OS;

	public Computer(double cost, String device, String service, int n, String OS, double total) {
		super(cost, device, service, n, total);
		this.OS = OS;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.yellow);
		String str = OS + "(" + getDevice() + "), " + getService() + ", Cost: " + getCost() + "........................Total: " + getTotal();
		g2.drawString(str, 30, 15*getN()+15);
	}
}
