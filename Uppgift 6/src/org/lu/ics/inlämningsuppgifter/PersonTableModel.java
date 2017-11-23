package org.lu.ics.inlämningsuppgifter;

import javax.swing.table.AbstractTableModel; 
import java.util.*; 

public class PersonTableModel extends AbstractTableModel {
	
	private String[] columnNames = {"Account holder", "Account number"};
	private ArrayList<Person> persons;

	public PersonTableModel() {
		super();
		persons = new ArrayList<Person>();
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}
	
	@Override
	public int getRowCount() {
		return persons.size();
	}
	
	@Override
	public Class getColumnClass(int column) {
		switch (column) {
		case 2: return ArrayList.class;
		default: return String.class;
		}
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		switch (column) {
		case 2: return true;
		default: return false;
		}
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		Person person = this.persons.get(row);
		
		switch (column) {
		case 0: return person.getName();
		case 1: return person.getPNbr();
		case 2: return person.getAccounts();
		default: return null;
		}
	}
	
	@Override
	public void setValueAt(Object value, int row, int column) {
		Person person = getPerson(row);
		
		switch (column) {
		case 0: person.setName((String)value); break;
		case 1: person.setPNbr((String)value); break;
		case 2: person.setAccounts((ArrayList)value); break;
		}
		
		fireTableCellUpdated(row, column);
	}
	
	
	public PersonTableModel(ArrayList<Person> persons) {
		this.persons = persons;
	}
	
	public Person getPerson(int row) {
		return persons.get(row);
	}
	
	public void addPerson(Person person) {
		insertPerson(getRowCount (), person);
	}
	
	public void insertPerson(int row, Person person) {
		persons.add(row, person);
		fireTableRowsInserted(row, row);
	}
	
	public void removePerson(int row) {
		persons.remove(row);
		fireTableRowsDeleted(row, row);
	}		

	public ArrayList<Person> getPersoner() {
		return persons;
	}
	
	public void setPersons(ArrayList<Person> newPersons) {
		persons = newPersons;
	}
	
	
	public Person findPerson(String pNbr) {
		for (Person p : this.persons) {
			if (p.getPNbr().equals(pNbr)) {
				return p;
			}
		}
		return null;
	}
	
	public Person removePerson(String pNbr) {
		Person p = findPerson(pNbr);
		if (p != null) {
			persons.remove(p);
		}
		return null;
	}
	public void setPersonName(String pNbr, String newName) {
		Person p = this.findPerson(pNbr);
		if (p != null) {
			p.setName(newName);
		}
	}
}


