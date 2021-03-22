package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.CRender;

public class RCanvas extends JPanel {
	private MainScreen panel;
	private ArrayList<CRender> charges = new ArrayList<>();

	public RCanvas(MainScreen panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(var c: charges) {
			c.render(g2);
		}
	}

	public ArrayList<CRender> getCharges() {
		return charges;
	}
}
