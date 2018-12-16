package com.example.demo.beans;

import java.util.Date;

public class Person {

	private String name;
	private int id;
	private Date birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Person() {

	};

	public Person(String name, int id, Date bdate) {
		this.setId(id);
		this.setName(name);
		this.setBirthDate(bdate);
	}
}
