package org.lu.ics.labs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class CustomerApplication {

	private JFrame frame;
	private JTextField textField_Name;
	private JTextField textField_CNbr;
	private JTextField textField_CardNbr;
	private JTextField textField_CardType;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnHasCard;
	private JRadioButton rdbtnNoCard;
	private JLabel lblResponse;
	private JLabel lblCardType;
	private JLabel lblCardNumber;
	private JLabel lblCustomerNumber;
	private JLabel lblName;
	private JButton btnNewName;
	private JButton btnDelete;
	private JButton btnFind;
	private JButton btnAdd;

	private Controller controller; // Koppling till klassen Controller
	private CustomerRegister customerRegister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerApplication window = new CustomerApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnAdd = new JButton("Add");
		btnAdd.setBounds(50, 312, 89, 23);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cName = textField_Name.getText();
				String cNumber = textField_CNbr.getText();
				if (rdbtnHasCard.isSelected()) {
					String cardType = textField_CardType.getText();
					int cardNumber;
					try {
						cardNumber = Integer.parseInt(textField_CardNbr.getText());
						controller.addCustomer(cNumber, cName, cardNumber, cardType);
						lblResponse.setText("Response:");
					} catch (Exception e1) {
						
						lblResponse.setText("Response: Ogiltigt värde, Card Number.");
					}
				} else {
					controller.addCustomer(cNumber, cName);
					lblResponse.setText("Response:");
				}
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnAdd);

		btnFind = new JButton("Find");
		btnFind.setBounds(50, 346, 89, 23);
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cNumber = textField_CNbr.getText();
				String[] tmpCustomer = controller.findCustomer(cNumber);
				if (tmpCustomer != null) {
					lblResponse.setText("Response:");
					if (tmpCustomer.length == 4) {// Have creditcard
						textField_CNbr.setText(tmpCustomer[0]);
						textField_Name.setText(tmpCustomer[1]);
						textField_CardType.setText(tmpCustomer[2]);
						textField_CardNbr.setText(tmpCustomer[3]);
						rdbtnHasCard.setSelected(true);
					} else if (tmpCustomer.length == 2) {
						textField_CNbr.setText(tmpCustomer[0]);
						textField_Name.setText(tmpCustomer[1]);
						textField_CardType.setText("");
						textField_CardNbr.setText("");
						rdbtnNoCard.setSelected(true);
					}
				} else {
					lblResponse.setText("Response: Customer not found");
				}
			}
		});
		frame.getContentPane().add(btnFind);

		btnDelete = new JButton("Delete");
		btnDelete.setBounds(50, 380, 89, 23);
		frame.getContentPane().add(btnDelete);

		btnNewName = new JButton("New Name");
		btnNewName.setBounds(230, 312, 111, 23);
		btnNewName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cNumber = textField_CNbr.getText();
				String[] tmpCustomer = controller.findCustomer(cNumber);
				if (tmpCustomer != null) {
					lblResponse.setText("Response:");
					String newName = textField_Name.getText();
					controller.updateCustomerName(cNumber, newName);
				} else {
					lblResponse.setText("Response: Customer not found");
				}
			}
		});
		frame.getContentPane().add(btnNewName);

		lblName = new JLabel("Name:");
		lblName.setBounds(50, 40, 49, 14);
		frame.getContentPane().add(lblName);

		lblCustomerNumber = new JLabel("Customer Number:");
		lblCustomerNumber.setBounds(50, 72, 121, 23);
		frame.getContentPane().add(lblCustomerNumber);

		lblCardType = new JLabel("Card Type ");
		lblCardType.setBounds(50, 172, 77, 14);
		frame.getContentPane().add(lblCardType);

		lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setBounds(50, 197, 77, 14);
		frame.getContentPane().add(lblCardNumber);

		textField_Name = new JTextField();
		textField_Name.setBounds(171, 37, 96, 20);
		frame.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);

		textField_CNbr = new JTextField();
		textField_CNbr.setBounds(171, 73, 96, 20);
		frame.getContentPane().add(textField_CNbr);
		textField_CNbr.setColumns(10);

		textField_CardNbr = new JTextField();
		textField_CardNbr.setBounds(171, 194, 96, 20);
		frame.getContentPane().add(textField_CardNbr);
		textField_CardNbr.setColumns(10);

		textField_CardType = new JTextField();
		textField_CardType.setBounds(171, 169, 96, 20);
		frame.getContentPane().add(textField_CardType);
		textField_CardType.setColumns(10);

		rdbtnHasCard = new JRadioButton("Has Card");
		rdbtnHasCard.setBounds(137, 102, 111, 23);
		buttonGroup.add(rdbtnHasCard);
		frame.getContentPane().add(rdbtnHasCard);

		rdbtnNoCard = new JRadioButton("No Card");
		rdbtnNoCard.setBounds(137, 139, 111, 23);
		buttonGroup.add(rdbtnNoCard);
		frame.getContentPane().add(rdbtnNoCard);

		lblResponse = new JLabel("Response:");
		lblResponse.setBounds(50, 255, 366, 23);
		frame.getContentPane().add(lblResponse);

		customerRegister = new CustomerRegister();
		controller = new Controller(customerRegister, frame);
	}
}
