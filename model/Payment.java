package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Payment implements CRender {
	private double amount;
	private int n;
	private double total;

	public Payment(double amount, int n, double total) {
		this.amount = amount;
		this.n = n;
		this.total = total;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.yellow);
		String str = "-" + amount + "......................................................................Total: " + total;
		g2.drawString(str, 30, 15*n+15);
	}
}
