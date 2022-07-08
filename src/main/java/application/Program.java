package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {

		Person p1 = new Person(1, "Carlos", "carlos@gmail.com");
		Person p2 = new Person(2, "Joaquim", "joaquim@gmail.com");
		Person p3 = new Person(3, "Ana", "ana@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
