package model;

import java.awt.Graphics2D;

public class Mobile extends Repair {
	private String model;

	public Mobile(int cost, String device, String service, String model) {
		super(cost, device, service);
		this.model = model;
	}

	@Override
	public void render(Graphics2D g2) {
		//
	}
}
