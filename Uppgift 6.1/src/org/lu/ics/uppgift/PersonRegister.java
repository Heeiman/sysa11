package org.lu.ics.uppgift;

import java.util.ArrayList;


public class PersonRegister {
	
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	public ArrayList<Person> getPersoner() {
		return persons;
	}
	
	public void setPersons(ArrayList<Person> newPersons) {
		persons = newPersons;
	}
	
	public void addPerson(Person newPerson) {
		this.persons.add(newPerson);
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

