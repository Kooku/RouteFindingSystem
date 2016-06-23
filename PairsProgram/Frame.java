package kunchaim;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Frame {

	private Location from;
	private Location to;
	private int x;
	private int day;
	private int cheapest;
	private int shortest;
	private Route tempShort;
	private Route tempCheap;
	private String[] daysOfWeek = { "U", "M", "T", "W", "R", "F", "S" };
	private String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
	private JFrame frmRfs;
	private JComboBox<String> comboBox;
	private JButton button_6;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private SystemManager sm;
	private List<Location> result = new ArrayList<Location>(0);
	private Route cheap;
	private Route shrt;
	private JLabel lblDay;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxShortestRouteOn;
	private JCheckBox chckbxCheapestRouteOf;
	private JCheckBox chckbxShortestRouteOf;
	private JButton btnPay;
	private JLabel route;
	// frmPay Variables
	private JFrame frmPay;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JCheckBox chckbxPayPal;
	private JCheckBox chckbxCreditCard;
	private JLabel lblMissingRequirements;
	private String[] provs = { "Alberta", "British Columbia", "Manitoba",
			"New Brunswick", "Newfoundland and Labrador",
			"Northwest Territories", "Nova Scotia", "Nunavut", "Ontario",
			"Prince Edward Island", "Québec", "Saskatchewan", "Yukon" };
	private String[] yrs = { "2015", "2016", "2017", "2018", "2019", "2020" };
	private boolean b = true;

	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					Frame window = new Frame(sm);
					window.frmRfs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 */

	private void initializeTwo() throws IOException {
		frmPay = new JFrame();
		frmPay.setTitle("Payment");
		frmPay.setBounds(100, 100, 600, 400);
		frmPay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPay.getContentPane().setLayout(null);

		JLabel lblFirstName = new JLabel("First Name *");
		lblFirstName.setBounds(10, 11, 71, 14);
		frmPay.getContentPane().add(lblFirstName);

		textField = new JTextField();
		textField.setBounds(10, 27, 151, 20);
		frmPay.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 27, 151, 20);
		frmPay.getContentPane().add(textField_1);

		JLabel lblLastName = new JLabel("Last Name *");
		lblLastName.setBounds(193, 11, 71, 14);
		frmPay.getContentPane().add(lblLastName);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 74, 334, 20);
		frmPay.getContentPane().add(textField_2);

		JLabel lblAddress = new JLabel("Address *");
		lblAddress.setBounds(10, 58, 71, 14);
		frmPay.getContentPane().add(lblAddress);

		JLabel lblPostalCode = new JLabel("Postal Code *");
		lblPostalCode.setBounds(10, 105, 71, 14);
		frmPay.getContentPane().add(lblPostalCode);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 122, 86, 20);
		frmPay.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(133, 122, 211, 20);
		frmPay.getContentPane().add(textField_4);

		JLabel lblCity = new JLabel("City *");
		lblCity.setBounds(133, 105, 71, 14);
		frmPay.getContentPane().add(lblCity);

		JLabel lblProvince = new JLabel("Province");
		lblProvince.setBounds(10, 153, 50, 14);
		frmPay.getContentPane().add(lblProvince);

		JComboBox<String> comboBox = new JComboBox();
		comboBox.setBounds(10, 170, 151, 20);
		for (String k : provs) {
			comboBox.addItem(k);
		}
		frmPay.getContentPane().add(comboBox);

		JLabel lblPaymentMethod = new JLabel("Payment Method");
		lblPaymentMethod.setBounds(10, 201, 128, 14);
		frmPay.getContentPane().add(lblPaymentMethod);

		chckbxCreditCard = new JCheckBox("Visa");
		chckbxCreditCard.setBounds(10, 218, 97, 23);
		frmPay.getContentPane().add(chckbxCreditCard);

		chckbxPayPal = new JCheckBox("MasterCard");
		chckbxPayPal.setBounds(10, 241, 97, 23);
		frmPay.getContentPane().add(chckbxPayPal);

		JLabel lblEmail = new JLabel("Email or Credit Card Number");
		lblEmail.setBounds(148, 201, 200, 14);
		frmPay.getContentPane().add(lblEmail);

		textField_5 = new JTextField();
		textField_5.setBounds(147, 219, 197, 20);
		frmPay.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(147, 261, 197, 20);
		frmPay.getContentPane().add(textField_6);

		JLabel lblPssword = new JLabel("Password");
		lblPssword.setBounds(148, 243, 78, 14);
		frmPay.getContentPane().add(lblPssword);

		JLabel lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(148, 292, 78, 14);
		frmPay.getContentPane().add(lblExpiryDate);

		JComboBox<String> comboBox_1 = new JComboBox();
		comboBox_1.setBounds(148, 317, 35, 20);
		for (int i = 1; i <= 12; i++) {
			comboBox_1.addItem(i + "");
		}
		frmPay.getContentPane().add(comboBox_1);

		JComboBox<String> comboBox_2 = new JComboBox();
		comboBox_2.setBounds(193, 317, 35, 20);
		for (int i = 1; i < 32; i++) {
			comboBox_2.addItem(i + "");
		}
		frmPay.getContentPane().add(comboBox_2);

		JComboBox<String> comboBox_3 = new JComboBox();
		comboBox_3.setBounds(238, 317, 71, 20);
		for (String k : yrs) {
			comboBox_3.addItem(k);
		}
		frmPay.getContentPane().add(comboBox_3);

		JLabel lblNewLabel = new JLabel("Issue Number");
		lblNewLabel.setBounds(380, 201, 114, 14);
		frmPay.getContentPane().add(lblNewLabel);

		JLabel lblSecurityNumber = new JLabel("Security Code");
		lblSecurityNumber.setBounds(380, 245, 114, 14);
		frmPay.getContentPane().add(lblSecurityNumber);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(382, 219, 97, 20);
		frmPay.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(382, 261, 97, 20);
		frmPay.getContentPane().add(textField_8);

		JButton btnNewButton = new JButton("Pay Now!");
		btnNewButton.setBounds(380, 26, 172, 104);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkPay()) {
					frmPay.setVisible(false);
					String track = "";
					for (int i = 0; i < 11; i++) {
						track += (int) (Math.random() * 10) + "";
					}
					JOptionPane
							.showMessageDialog(
									frmPay,
									"Thank you for choosing Zaamtech. Your shipping will be available later today. \n Your tracking number is: "
											+ track);
					System.exit(0);
				} else {
					lblMissingRequirements.setVisible(true);
				}
			}
		});

		frmPay.getContentPane().add(btnNewButton);
		
		lblMissingRequirements = new JLabel("Missing requirements");
		lblMissingRequirements.setBackground(Color.RED);
		lblMissingRequirements.setBounds(380, 141, 172, 14);
		lblMissingRequirements.setVisible(false);
		frmPay.getContentPane().add(lblMissingRequirements);

		chckbxCreditCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxPayPal.setSelected(false);
				b = false;
			}
		});
		chckbxPayPal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxCreditCard.setSelected(false);
				b = false;
			}
		});

	}

	private boolean checkPay() {
		if (textField.getText().length() > 0 && textField_1.getText().length() > 0
				&& textField_2.getText().length() > 0
				&& textField_3.getText().length() > 0
				&& textField_4.getText().length() > 0
				&& textField_5.getText().length() > 0
				&& textField_6.getText().length() > 0
				&& textField_7.getText().length() > 0
				&& textField_8.getText().length() > 0) {
			return chckbxPayPal.isSelected() || chckbxCreditCard.isSelected();

		}
			return false;
	}

	public Frame(SystemManager sys) {
		try {
			sm = sys;
			from = sm.locations.get(0);
			day = 0;
			initialize();
			initializeTwo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void display() {

		result = new ArrayList<Location>();
		String availDay = "";
		ArrayList<Integer> x = new ArrayList<Integer>(0);
		for (int i = 0; i < sm.locations.size(); i++) {
			to = sm.locations.get(i);

			try {
				if (!(sm.findCheapestRoute(from, to, daysOfWeek[day])
						.totalCost() == 0.0))
					result.add(to);
			} catch (Exception e) {
				
			}

		}
		try {
			if (result.size() != 0) {
				comboBox_1.removeAllItems();
				for (Location l : result) {
					if (!(l.name.equals(from.name)))
						comboBox_1.addItem(l.name);
				}
			} else {
				comboBox_1.removeAllItems();
				comboBox_1.addItem("No Routes");
			}
		} catch (Exception e) {
			comboBox_1.removeAllItems();
			comboBox_1.addItem("No Routes");
		}
		if (comboBox_1.getItemAt(0).equals("No Routes")) {
			for (int i = 0; i < sm.locations.size(); i++) {
				to = sm.locations.get(i);
				for (int k = 0; k < 7; k++) {
					try {
						if (!(sm.findCheapestRoute(from, to, daysOfWeek[k])
								.totalCost() == 0.0)) {
							if (!(x.contains(k))) {
								x.add(k);
							}
						}
					} catch (Exception e) {

					}
				}
			}
			for (Integer k : x) {
				availDay += " " + days[k];
			}
			lblNewLabel_1.setText("(More Routes on:" + availDay + ")");

		} else {
			lblNewLabel_1.setText("");
		}

	}

	/**
	 * Initialize the contents of the frmPay.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		frmRfs = new JFrame();
		frmRfs.setTitle("RFS");
		frmRfs.setBounds(100, 100, 600, 400);
		frmRfs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRfs.getContentPane().setLayout(null);

		frmRfs.setContentPane(new JLabel(new ImageIcon("background.png")));

		comboBox = new JComboBox<String>();
		comboBox.setBounds(131, 81, 137, 31);
		frmRfs.getContentPane().add(comboBox);
		for (Location l : sm.locations) {
			comboBox.addItem(l.name);
		}
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				from = sm.findLocation(comboBox.getItemAt(comboBox
						.getSelectedIndex()));
				display();
			}
		});

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(306, 81, 137, 31);
		frmRfs.getContentPane().add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				to = sm.findLocation(comboBox_1.getItemAt(comboBox_1
						.getSelectedIndex()));
			}
		});

		button_6 = new JButton("Find Routes");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (!(comboBox_1.getItemAt(0).equals("No Routes"))) {
						cheap = sm.findCheapestRoute(from, to, daysOfWeek[day]);
						table_1.setValueAt("$" + cutDouble(cheap.totalCost()),
								1, 0);
						table_1.setValueAt(cheap.totalDistance() + " Km", 1, 1);
						shrt = sm
								.findShortestKmRoute(from, to, daysOfWeek[day]);
						table_2.setValueAt("$" + cutDouble(shrt.totalCost()),
								1, 0);
						table_2.setValueAt(shrt.totalDistance() + " Km", 1, 1);
						shortest = day;
						cheapest = day;
						if (day == 6)
							x = day;
						else
							x = day + 1;

						for (int i = 0; i < 7; i++) {
							try {
								tempCheap = sm.findCheapestRoute(from, to,
										daysOfWeek[x]);
								tempShort = sm.findShortestKmRoute(from, to,
										daysOfWeek[x]);
								if (tempCheap.totalCost() < cheap.totalCost()) {
									cheap = tempCheap;
									cheapest = x;
								}
								if (tempShort.totalDistance() < shrt
										.totalDistance()) {
									shrt = tempShort;
									shortest = x;
								}

							} catch (Exception e) {

							}

							if (x == 6)
								x = 0;
							x++;
						} // for
						chckbxCheapestRouteOf
								.setText("Cheapest Route of the week("
										+ days[cheapest] + ")");
						table_3.setValueAt("$" + cutDouble(cheap.totalCost()),
								1, 0);
						table_3.setValueAt(cheap.totalDistance() + " Km", 1, 1);
						chckbxShortestRouteOf
								.setText("Shortest Route of the week("
										+ days[shortest] + ")");
						table_4.setValueAt("$" + cutDouble(shrt.totalCost()),
								1, 0);
						table_4.setValueAt(shrt.totalDistance() + " Km", 1, 1);
					}
				} catch (Exception e) {

				}
			}
		});

		button_6.setBackground(Color.GREEN);
		button_6.setBounds(477, 90, 100, 23);
		frmRfs.getContentPane().add(button_6);

		JLabel lblTo = new JLabel("From");
		lblTo.setBounds(132, 60, 46, 14);
		frmRfs.getContentPane().add(lblTo);

		JLabel label = new JLabel("To");
		label.setBounds(306, 60, 46, 14);
		frmRfs.getContentPane().add(label);

		lblDay = new JLabel("Day");
		lblDay.setBounds(10, 60, 46, 14);
		frmRfs.getContentPane().add(lblDay);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(10, 81, 72, 31);
		frmRfs.getContentPane().add(comboBox_2);
		for (String l : days) {
			comboBox_2.addItem(l);
		}
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				day = comboBox_2.getSelectedIndex();
				display();
			}
		});

		lblNewLabel = new JLabel("Route Finding System For You!");
		lblNewLabel.setBounds(203, 6, 209, 50);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmRfs.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(327, 60, 250, 14);
		frmRfs.getContentPane().add(lblNewLabel_1);

		table_1 = new JTable(2, 2) {

			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table_1.setBounds(10, 174, 168, 50);
		table_1.setRowHeight(26);
		setTable(table_1);
		frmRfs.getContentPane().add(table_1);

		table_2 = new JTable(2, 2) {

			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table_2.setBounds(10, 292, 168, 50);
		table_2.setRowHeight(26);
		setTable(table_2);
		frmRfs.getContentPane().add(table_2);

		table_3 = new JTable(2, 2) {

			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table_3.setBounds(248, 174, 168, 50);
		table_3.setRowHeight(26);
		setTable(table_3);
		frmRfs.getContentPane().add(table_3);

		table_4 = new JTable(2, 2) {

			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table_4.setBounds(248, 292, 168, 50);
		table_4.setRowHeight(26);
		setTable(table_4);
		frmRfs.getContentPane().add(table_4);

		chckbxNewCheckBox = new JCheckBox("Cheapest Route on selected day");
		chckbxNewCheckBox.setBounds(10, 144, 220, 23);
		chckbxNewCheckBox.setOpaque(false);
		frmRfs.getContentPane().add(chckbxNewCheckBox);

		chckbxShortestRouteOn = new JCheckBox("Shortest Route on selected day");
		chckbxShortestRouteOn.setBounds(10, 262, 220, 23);
		chckbxShortestRouteOn.setOpaque(false);
		frmRfs.getContentPane().add(chckbxShortestRouteOn);

		chckbxCheapestRouteOf = new JCheckBox("Cheapest Route of the week");
		chckbxCheapestRouteOf.setBounds(248, 144, 220, 23);
		chckbxCheapestRouteOf.setOpaque(false);
		frmRfs.getContentPane().add(chckbxCheapestRouteOf);

		chckbxShortestRouteOf = new JCheckBox("Shortest Route of the week");
		chckbxShortestRouteOf.setBounds(248, 262, 220, 23);
		chckbxShortestRouteOf.setOpaque(false);
		frmRfs.getContentPane().add(chckbxShortestRouteOf);

		route = new JLabel("");
		route.setBounds(444, 120, 200, 81);
		route.setOpaque(false);
		frmRfs.getContentPane().add(route);

		btnPay = new JButton("Pay!");
		btnPay.setBounds(444, 174, 113, 81);
		frmRfs.getContentPane().add(btnPay);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (checkValid()) {
						frmPay.setVisible(true);
						frmRfs.setVisible(false);
					} else {
						route.setText("Select a valid route");
					}
				} catch (Exception e) {
				}
			}
		});

		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				unCheck(chckbxNewCheckBox);
			}
		});
		chckbxShortestRouteOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				unCheck(chckbxShortestRouteOn);
			}
		});
		chckbxCheapestRouteOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				unCheck(chckbxCheapestRouteOf);
			}
		});
		chckbxShortestRouteOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				unCheck(chckbxShortestRouteOf);
			}
		});

	}

	private void setTable(JTable t) {
		t.setValueAt("Cost", 0, 0);
		t.setValueAt("Distance", 0, 1);
	}

	private void unCheck(JCheckBox j) {
		chckbxNewCheckBox.setSelected(false);
		chckbxShortestRouteOn.setSelected(false);
		chckbxCheapestRouteOf.setSelected(false);
		chckbxShortestRouteOf.setSelected(false);
		j.setSelected(true);
	}

	private double cutDouble(double n) {
		return Math.round(n * 100) / 100.0;
	}

	private boolean checkValid() {
		return ((chckbxNewCheckBox.isSelected() && (table_3.getValueAt(1, 0) != null))
				|| (chckbxShortestRouteOn.isSelected() && (table_3.getValueAt(
						1, 0) != null))
				|| (chckbxCheapestRouteOf.isSelected() && (table_3.getValueAt(
						1, 0) != null)) || (chckbxShortestRouteOf.isSelected() && (table_3
				.getValueAt(1, 0) != null)));

	}
}



