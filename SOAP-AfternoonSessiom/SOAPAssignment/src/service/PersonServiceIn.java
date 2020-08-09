package service;

import model.Person;

public interface PersonServiceIn 
{

    boolean addPerson(Person p);
	
	boolean deletePerson(int id);
	
	Person getPerson(int id);
	
	Person[] getAllPersons();
}
