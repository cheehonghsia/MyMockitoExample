package com.chhsia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhsia.dao.PersonDao;
import com.chhsia.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired private PersonDao personDao;

	public long addPerson(Person person) {
		
		return personDao.addPerson(person);
	}

	public void deletePerson(Person person) {

		personDao.deletePerson(person);

	}

}
