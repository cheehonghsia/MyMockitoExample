package com.chhsia.model;

/**
 * @author Chee-Hong
 *
 */
public class Person {
	
	private long id;
	private String name;

	public Person(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
