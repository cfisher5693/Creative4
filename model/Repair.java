package model;

import java.awt.Graphics2D;

public abstract class Repair implements CRender {
	private int cost;
	private String device;
	private String service;

	public Repair(int cost, String device, String service) {
		this.cost = cost;
		this.device = device;
		this.service = service;
	}

	public int getCost() {
		return cost;
	}

	public String getDevice() {
		return device;
	}

	public String getService() {
		return service;
	}
}
