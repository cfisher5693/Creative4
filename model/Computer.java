package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Computer extends Repair {
	private String OS;

	public Computer(int cost, String device, String service, String OS) {
		super(cost, device, service);
		this.OS = OS;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.yellow);
		String str = OS + "(" + getDevice() + ") " + getService() + "......................" + getCost();
		g2.drawString(str, 30, 10);
	}
}
