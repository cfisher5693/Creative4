package model;

import java.awt.Graphics2D;

public class Console extends Repair {
	private String manufacturer;

	public Console(int cost, String device, String service, String manufacturer) {
		super(cost, device, service);
		this.manufacturer = manufacturer;
	}

	@Override
	public void render(Graphics2D g2) {
		//
	}
}
