package org.lu.ics.labbar;

import java.util.*;

public class PersonRegister {
	private LinkedList<Person> persons;
	
	public PersonRegister () {
		this.setPersons (new LinkedList<Person>());
	}
	public LinkedList<Person> getPersons () {
		return persons;
	}
	public void setPersons(LinkedList<Person> newPersons) {
		persons = newPersons;
	}

	public void addPerson (Person p) {
		this.getPersons().add(p);
	}
	
	public Person findPerson(String pNbr) {
        for (Person p : persons) {
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

}
