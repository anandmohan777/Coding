package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

public class ForEachPeek {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		List<Person> l1 = Arrays.asList(new Person(2, "baban", "b@b.com", new Date(1991, 5, 5)), new Person(1, "anand",
		        "a@a.com", new Date(1990, 1, 1)), new Person(4, "cacan", "c@c.com", new Date(1889, 5, 7)), new Person(
		        3, "dadan", "d@d.com", new Date(1987, 4, 8)));

		Consumer<String> c1 = System.out::println;
		Consumer<Person> c2 = System.out::println;
		l1.stream().map(s -> s.getName()).forEach(c1);
		
		List<Person> result = new ArrayList<Person>();
		l1.stream().filter(s -> {
			if(s!=null && s.getName().contains("anand")) {
				return true;
			}
			else return false;
		}).peek(p -> result.add(p)).forEach(c2);
		System.out.println("result List " + l1);
	}
}

class Person {
	long id;
	String name;
	String email;
	Date dob;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Person(long id, String name, String email, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	@Override
    public String toString() {
	    return "Person [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
    }
	
}