package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.RepairListener;

public class MainScreen {
	private JFrame window;
	private RCanvas canvas;
	private int n;
	private JTextField inputField = new JTextField();
	private JTextField numField = new JTextField();
	private JButton addButton = new JButton("Add");
	private JButton clearButton = new JButton("Clear");
	private JButton enterButton = new JButton("Enter");
	private JButton decimalKey = new JButton(".");
	private JButton[] numKeys;
	private String[] devices = new String[] {"Mobile", "Console", "Computer"};
	private String[] services = new String[] {"Standard", "Advanced", "Premium"};
	private JComboBox<String> deviceList = new JComboBox<>(devices);
	private JComboBox<String> serviceList = new JComboBox<>(services);

	public MainScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();
		canvas = new RCanvas(this);
		JPanel southPanel = new JPanel();
		JPanel northPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2, 1));
		JPanel servicePanel = new JPanel();
		JPanel keypad = new JPanel();
		RepairListener listener = new RepairListener(this);
		keypad.setLayout(new GridLayout(4, 3));
		servicePanel.add(clearButton);
		servicePanel.add(deviceList);
		inputField.setFont(new Font("Courier New", Font.BOLD, 16));
		servicePanel.add(inputField);
		inputField.setEditable(true);
		inputField.setColumns(10);
		servicePanel.add(serviceList);
		servicePanel.add(addButton);
		clearButton.addActionListener(listener);
		//deviceList.addActionListener(listener);
		//serviceList.addActionListener(listener);
		addButton.addActionListener(listener);
		inputField.addActionListener(listener);
		servicePanel.setBorder(BorderFactory.createTitledBorder("Add Charges"));
		southPanel.add(servicePanel);
		numKeys = new JButton[10];
		n = 0;
		for(char i = '0'; i <= '9'; i++) {
			numKeys[n] = new JButton("" + i);
			keypad.add(numKeys[n]);
			numKeys[n].addActionListener(listener);
			n++;
		}
		keypad.add(decimalKey);
		keypad.add(enterButton);
		decimalKey.addActionListener(listener);
		enterButton.addActionListener(listener);
		keypad.setBorder(BorderFactory.createTitledBorder("Keypad"));
		southPanel.add(keypad);
		numField.setFont(new Font("Courier New", Font.BOLD, 16));
		northPanel.add(numField);
		numField.setEditable(false);
		numField.setColumns(10);
		cp.add(BorderLayout.CENTER, canvas);
		cp.add(BorderLayout.SOUTH, southPanel);
		cp.add(BorderLayout.NORTH, northPanel);
	}

	public RCanvas getCanvas() {
		return canvas;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public JComboBox<String> getDeviceList() {
		return deviceList;
	}

	public JComboBox<String> getServiceList() {
		return serviceList;
	}

	public JFrame getWindow() {
		return window;
	}

	public JButton[] getNumKeys() {
		return numKeys;
	}

	public JButton getEnterButton() {
		return enterButton;
	}

	public JButton getDecimalKey() {
		return decimalKey;
	}

	public JTextField getInputField() {
		return inputField;
	}

	public JTextField getNumField() {
		return numField;
	}
}
