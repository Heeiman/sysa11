package org.lu.ics.uppgift;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import javax.swing.JTextArea;

public class PersonApplication {

	private JFrame frame;
	private JTextField textField_Name;
	private JTextField textField_pNbr;
	private JTextField textField_AccNbr;
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
	private JLabel lblIfNoPlease;
	private JLabel lblResponse_Account;
	private JLabel lblResponse_Person;
	private JButton btnFindPerson;
	private JTextArea textArea_Display;
	
	private Controller controller;
	private PersonRegister personRegister;
	private JLabel lblPleaseClearBoxes;
	private JLabel lbltoShowAccounts;
	
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
	
		
		btnAddPerson = new JButton("Add Person");
		btnAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pNbr = textField_pNbr.getText();
				String name = textField_Name.getText();
				controller.addPerson(pNbr, name);
				lblResponse_Person.setText("Person added.");
				
			}
		}
		);
		btnAddPerson.setBounds(436, 70, 159, 23);
		frame.getContentPane().add(btnAddPerson);
		btnAddPerson = new JButton("Add New Person");


		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnAddPerson);
		
		
		btnFindPerson = new JButton("Find Person");
		btnFindPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pNbr = textField_pNbr.getText();
				String tmpPerson = controller.findPerson(pNbr);
				if (tmpPerson != null) {
						textField_Name.setText(tmpPerson);
						lblResponse_Person.setText("Person found.");
			}
			}
		});
		btnFindPerson.setBounds(436, 104, 159, 23);
		frame.getContentPane().add(btnFindPerson);
		
		btnRemovePerson = new JButton("Remove Person");
		btnRemovePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pNbr = textField_pNbr.getText();
				controller.removePerson(pNbr);
				lblResponse_Person.setText("Person removed.");
				
			}
		});
		btnRemovePerson.setBounds(436, 138, 159, 23);
		frame.getContentPane().add(btnRemovePerson);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(179, 94, 142, 20);
		frame.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		lblFullName = new JLabel("Full name:");
		lblFullName.setBounds(109, 97, 75, 14);
		frame.getContentPane().add(lblFullName);
		
		lblSocialSecurityNumber = new JLabel("Personal identity number:");
		lblSocialSecurityNumber.setBounds(20, 131, 149, 14);
		frame.getContentPane().add(lblSocialSecurityNumber);
		
		textField_pNbr = new JTextField();
		textField_pNbr.setBounds(179, 128, 142, 20);
		frame.getContentPane().add(textField_pNbr);
		textField_pNbr.setColumns(10);
		
		btnAddAccountTo = new JButton("Add New Account to Person");
		btnAddAccountTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pNbr = textField_pNbr.getText();
				String accNbr = textField_AccNbr.getText();
				String tmpPerson = controller.findPerson(pNbr);
				if (tmpPerson != null) {
					textField_Name.setText(tmpPerson);	
						controller.addPersonAccount(pNbr, accNbr);
						lblResponse_Account.setText("Account added.");
				}
				
			}
		}
		);
		btnAddAccountTo.setBounds(402, 278, 193, 23);
		frame.getContentPane().add(btnAddAccountTo);
		
		separator = new JSeparator();
		separator.setBounds(258, 216, 237, 2);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(382, 349, 41, 140);
		frame.getContentPane().add(separator_1);
		
		lblAccounts = new JLabel("ACCOUNT DISPLAY");
		lblAccounts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAccounts.setBounds(132, 351, 132, 31);
		frame.getContentPane().add(lblAccounts);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(258, 336, 237, 2);
		frame.getContentPane().add(separator_2);
		
		lblWelcomeToAtm = new JLabel("Welcome!");
		lblWelcomeToAtm.setFont(new Font("Arial", Font.ITALIC, 24));
		lblWelcomeToAtm.setBounds(328, 11, 186, 23);
		frame.getContentPane().add(lblWelcomeToAtm);
		
		lblPleaseEnterName = new JLabel("Please enter name and personal identity number (obligatory).");
		lblPleaseEnterName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblPleaseEnterName.setBounds(39, 69, 335, 14);
		frame.getContentPane().add(lblPleaseEnterName);
		
		textField_AccNbr = new JTextField();
		textField_AccNbr.setBounds(179, 279, 142, 20);
		frame.getContentPane().add(textField_AccNbr);
		textField_AccNbr.setColumns(10);
		
		lblAccountNumber = new JLabel("Account number:");
		lblAccountNumber.setBounds(69, 282, 112, 14);
		frame.getContentPane().add(lblAccountNumber);
		
		btnNewButton = new JButton("Show accounts");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_Display.setText(null);
				String pNbr = textField_pNbr.getText();
				LinkedList<Account> account_list = controller.showAccounts(pNbr);
				if (account_list != null) {
					for (Account account : account_list) {
						textArea_Display.append(account.getNbr() + "\n");						
					}
				}
			}
			
		});		
		btnNewButton.setBounds(502, 394, 132, 52);
		frame.getContentPane().add(btnNewButton);
		
		lblIfNoPlease = new JLabel("If you wish to make a new account, please enter prefered account number and press \"Add New Account to Person\" to proceed.");
		lblIfNoPlease.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblIfNoPlease.setBounds(39, 253, 656, 14);
		frame.getContentPane().add(lblIfNoPlease);
		
		lblResponse_Account = new JLabel("");
		lblResponse_Account.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblResponse_Account.setBounds(630, 278, 132, 23);
		frame.getContentPane().add(lblResponse_Account);
		
		lblResponse_Person = new JLabel("");
		lblResponse_Person.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblResponse_Person.setBounds(630, 108, 140, 19);
		frame.getContentPane().add(lblResponse_Person);
		
		textArea_Display = new JTextArea();
		textArea_Display.setBounds(93, 393, 186, 77);
		frame.getContentPane().add(textArea_Display);
		
		lblPleaseClearBoxes = new JLabel("Please clear boxes and reinstate values before choosing new action.");
		lblPleaseClearBoxes.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblPleaseClearBoxes.setBounds(39, 172, 383, 14);
		frame.getContentPane().add(lblPleaseClearBoxes);
		
		lbltoShowAccounts = new JLabel("(To show accounts, please enter Personal identity number first)");
		lbltoShowAccounts.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lbltoShowAccounts.setBounds(412, 457, 348, 14);
		frame.getContentPane().add(lbltoShowAccounts);
		
		personRegister = new PersonRegister();
		controller = new Controller(personRegister, frame);
	}
}