package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Mobile extends Repair {
	private String model;

	public Mobile(int cost, String device, String service, String model) {
		super(cost, device, service);
		this.model = model;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.yellow);
		String str = model + "(" + getDevice() + ") " + getService() + "......................" + getCost();
		g2.drawString(str, 30, 10);
	}
}
