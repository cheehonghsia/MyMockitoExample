package com.chhsia.dao;

import com.chhsia.model.Person;

public interface PersonDao {
	
	public long addPerson(Person person);
	
	public void deletePerson(Person person);

}
