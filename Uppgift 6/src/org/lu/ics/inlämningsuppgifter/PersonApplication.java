package org.lu.ics.inlämningsuppgifter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PersonApplication {

	private JFrame frame;
	private JTextField textField_Name;
	private JTextField textField_pNbr;
	private JTable table;
	private JTextField textField_AccNbr;
	private JTextField textField_3;
	private JButton btnAddPerson;
	private JButton btnRemovePerson;
	private JLabel lblFullName;
	private JLabel lblSocialSecurityNumber;
	private JButton btnAddAccountTo;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblAccounts;
	private JSeparator separator_2;
	private JLabel lblWelcomeToAtm;
	private JLabel lblPleaseEnterName;
	private JLabel lblAccountNumber;
	private JButton btnNewButton;
	private JLabel lblAmount;
	private JButton btnWithdraw;
	private JButton btnCredit;
	private JLabel lblIfNoPlease;
	private JLabel lblAccountAdded;
	private JLabel lblResponse_Person;
	private JLabel lblResponse_Balance;
	private JButton btnFindPerson;
	
	private Controller controller;
	private PersonTableModel personTable;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonApplication window = new PersonApplication();
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
	public PersonApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnAddPerson = new JButton("Add Person");
		btnAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField_Name.getName();
				//controller.addRow(textField_pNbr.getText());
				}
			}
		);
		btnAddPerson.setBounds(412, 114, 159, 23);
		frame.getContentPane().add(btnAddPerson);
		btnAddPerson = new JButton("Add New Person");


		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnAddPerson);
		
		
		btnFindPerson = new JButton("Find Person");
		btnFindPerson.setBounds(412, 46, 159, 23);
		frame.getContentPane().add(btnFindPerson);
		
		btnRemovePerson = new JButton("Remove Person");
		btnRemovePerson.setBounds(412, 80, 159, 23);
		frame.getContentPane().add(btnRemovePerson);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(179, 69, 142, 20);
		frame.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		lblFullName = new JLabel("Full name:");
		lblFullName.setBounds(110, 72, 75, 14);
		frame.getContentPane().add(lblFullName);
		
		lblSocialSecurityNumber = new JLabel("Personal identity number:");
		lblSocialSecurityNumber.setBounds(21, 97, 149, 14);
		frame.getContentPane().add(lblSocialSecurityNumber);
		
		textField_pNbr = new JTextField();
		textField_pNbr.setBounds(179, 94, 142, 20);
		frame.getContentPane().add(textField_pNbr);
		textField_pNbr.setColumns(10);
		
		btnAddAccountTo = new JButton("Add New Account to Person");
		btnAddAccountTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddAccountTo.setBounds(404, 216, 193, 23);
		frame.getContentPane().add(btnAddAccountTo);
		
		separator = new JSeparator();
		separator.setBounds(258, 157, 237, 2);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(382, 349, 41, 140);
		frame.getContentPane().add(separator_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel());
		table.getColumnModel().getColumn(1);

		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setPreferredWidth(107);
		table.setBounds(39, 349, 273, 151);
		frame.getContentPane().add(table);
		
		lblAccounts = new JLabel("ACCOUNT DISPLAY");
		lblAccounts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAccounts.setBounds(123, 318, 132, 31);
		frame.getContentPane().add(lblAccounts);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(258, 322, 237, 2);
		frame.getContentPane().add(separator_2);
		
		lblWelcomeToAtm = new JLabel("Welcome to ATM!");
		lblWelcomeToAtm.setFont(new Font("Arial", Font.ITALIC, 18));
		lblWelcomeToAtm.setBounds(309, 11, 186, 14);
		frame.getContentPane().add(lblWelcomeToAtm);
		
		lblPleaseEnterName = new JLabel("Please enter name and personal identity number (obligatory).");
		lblPleaseEnterName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblPleaseEnterName.setBounds(39, 44, 335, 14);
		frame.getContentPane().add(lblPleaseEnterName);
		
		textField_AccNbr = new JTextField();
		textField_AccNbr.setBounds(169, 217, 142, 20);
		frame.getContentPane().add(textField_AccNbr);
		textField_AccNbr.setColumns(10);
		
		lblAccountNumber = new JLabel("Account number:");
		lblAccountNumber.setBounds(58, 220, 112, 14);
		frame.getContentPane().add(lblAccountNumber);
		
		btnNewButton = new JButton("Show accounts");
		btnNewButton.setBounds(318, 289, 132, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(474, 349, 199, 23);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblAmount = new JLabel("Amount:");
		lblAmount.setBounds(412, 349, 89, 20);
		frame.getContentPane().add(lblAmount);
		
		btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(457, 393, 89, 23);
		frame.getContentPane().add(btnWithdraw);
		
		btnCredit = new JButton("Credit");
		btnCredit.setBounds(580, 393, 89, 23);
		frame.getContentPane().add(btnCredit);
		
		lblIfNoPlease = new JLabel("If you wish to make a new account, please enter prefered account number and press \"Add New Account to Person\" to proceed.");
		lblIfNoPlease.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblIfNoPlease.setBounds(39, 192, 656, 14);
		frame.getContentPane().add(lblIfNoPlease);
		
		lblAccountAdded = new JLabel("RESPONSE2");
		lblAccountAdded.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblAccountAdded.setBounds(636, 216, 79, 23);
		frame.getContentPane().add(lblAccountAdded);
		
		lblResponse_Person = new JLabel("RESPONSE1\r\n");
		lblResponse_Person.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblResponse_Person.setBounds(636, 84, 79, 19);
		frame.getContentPane().add(lblResponse_Person);
		
		lblResponse_Balance = new JLabel("RESPONSE3");
		lblResponse_Balance.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblResponse_Balance.setBounds(523, 439, 94, 25);
		frame.getContentPane().add(lblResponse_Balance);
	}
}