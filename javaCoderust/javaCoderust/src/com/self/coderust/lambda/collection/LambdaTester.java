package com.self.coderust.lambda.collection;

import java.util.List;

public class LambdaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPersonsOlderThan(Person.createShortList(), 25);
	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		
		
	    for (Person p : roster) {
	        if (p.getAge() >= age) {
	            p.print();
	        }
	    }
	}
}

	    