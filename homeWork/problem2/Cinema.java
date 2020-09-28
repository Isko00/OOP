package oop.homeWork.problem2;

import java.util.Vector;
import oop.homeWork.problem2.*;

public class Cinema {
	private Vector<Person> hall;

	public Cinema() {
		hall = new Vector<Person>();
	}

	private void print() {
		for (Person p : hall) {
			System.out.println(p);
		}
	}

	private void add(Person p) {
		hall.add(p);
	}

	public static void main(String[] args) {
		Cinema kinepolis = new Cinema();
		for (int i = 10; i < 20; i++) {
			Person temp;
			if (i % 2 == 0) {
				temp = new Student("" + i, (char)(i + 55) + " " + (i + 80),
						(char)(i + 100) + "", i + 2000, i + 100 + i * 0.01);
			} else {
				temp = new Staff("" + i, (char)(i + 55) + " " + (i + 80),
						"" + i + 20, i * 10000 + i * 0.1);
			}
			kinepolis.add(temp);
		}
		kinepolis.print();
	}
}