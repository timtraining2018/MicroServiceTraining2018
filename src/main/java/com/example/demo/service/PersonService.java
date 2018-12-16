package com.example.demo.service;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Person;

@Service
public class PersonService {
	
	List<Person> persons = new ArrayList<Person>();
	
	 public List<Person> getPersons(){
		 return persons;
	 }
	 
	 public PersonService() {
		 persons.add(new Person("A",1,new Date()));
		 persons.add(new Person("B",2,new Date()));
		 persons.add(new Person("C",3,new Date()));
	 }
	 
	 public List<Person>getAllPersons(){ return persons;}
	 
	 public Person getPerson(int id) {
		 
		 for(Person person: persons) {
			 if(person.getId()== id)
			 {
				 System.out.println("Service: "+id);
				 
				 return person;
			 }
		 }
		 return null;
	 }
	 
	 public Person addPerson(Person person) {
		 int size = persons.size();
		 person.setId(++size);
		 persons.add(person);
		 return person;
		 
	 }
	 
	 public Person deletePerson(int id) {
		 Person person = new Person();
		 person.setId(id);
		 if(persons.remove(person))
			 return person;
		 else
			 return null;
	 }

}
