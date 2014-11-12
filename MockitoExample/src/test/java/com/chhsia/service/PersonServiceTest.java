package com.chhsia.service;

import static org.mockito.Mockito.when;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.chhsia.dao.PersonDao;
import com.chhsia.exception.PersonWithNoNameException;
import com.chhsia.model.Person;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

	@Mock private PersonDao personDao;
	@InjectMocks private PersonServiceImpl personService;
	private Person personWithNullName;
	
	@Before
	public void setUp() throws Exception {

		personWithNullName = new Person(101l, null);
		
		when(personService.addPerson((Person)Matchers.anyObject())).thenReturn(100l);	
		when(personService.addPerson(personWithNullName)).thenThrow(new PersonWithNoNameException());	
		
	}

	@Test
	public void testPersonServiceWithValidPerson() {

		Person person = new Person(100l, "Chee-Hong");
		
		Assert.assertEquals(person.getId(), personService.addPerson(person));
		
	}
	
	@Test(expected = PersonWithNoNameException.class) 
	public void testPersonServiceWithNullPersonName() {
		
		personService.addPerson(personWithNullName);
		
	}
}
	