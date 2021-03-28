package model;

public abstract class Repair implements CRender {
	private double cost;
	private double total;
	private int n;
	private String device;
	private String service;

	public Repair(double cost, String device, String service, int n, double total) {
		this.cost = cost;
		this.device = device;
		this.service = service;
		this.n = n;
		this.total = total;
	}

	public double getCost() {
		return cost;
	}

	public String getDevice() {
		return device;
	}

	public String getService() {
		return service;
	}

	public int getN() {
		return n;
	}

	public double getTotal() {
		return total;
	}
}
