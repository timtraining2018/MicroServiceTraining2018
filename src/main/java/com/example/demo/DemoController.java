package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Person;
import com.example.demo.service.PersonService;

@RestController
public class DemoController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/greet")
	public String greeting() {
	  	return "Karibuni Spring REST";
	}
	
	@PostMapping("/greet/{name}/{id}/{age}")
	public String greeting(@PathVariable String name,@PathVariable int id,@PathVariable int age){
		return "Karibuni Spring REST  "+name+"\t"+age+"\t"+id;
	}
	
	@PostMapping("/persons")
	public String addPersonService(@RequestBody Person person) {
		return "person added : "+person.getName()+"\t birthdate:- "+person.getBirthDate();
	}
	
	@PostMapping("/persons-data")
	public Person addPersonServiceNew(@RequestBody Person person) {
		return personService.addPerson(person);
	}
	
	@GetMapping("/persons-data")
	public List<Person> getPersons(){
		return personService.getAllPersons();
	}
	
	@GetMapping("/persons-data/{id}")
	public Person getPersonService(@PathVariable int id){
		return personService.getPerson(id);
	}
	
	
}

