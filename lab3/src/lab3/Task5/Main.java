package lab3.Task5;

import java.util.Date;

import lab3.Task4.Employee;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
/*
		Chocolate[] cArr = {new Chocolate(12, "Twix"), new Chocolate(23, "Albeny"), 
				new Chocolate(6, "Kazakhstan")};
		//Sort.mergeSort(cArr);
		Sort.bubbleSort(cArr);
		for (Chocolate c : cArr) {
			System.out.println(c);
		}

		Time[] tArr = {new Time(123), new Time(234), new Time(60)};
		//Sort.mergeSort(tArr);
		//Sort.bubbleSort(tArr);
		for (Time t : tArr) {
			System.out.println(t);
		}
*/
		Employee[] eArr = {new Employee("Islam", 22.5, new Date(101, 6, 12), "ijn543"),
				new Employee("Rufat", 19.3, new Date(101, 9, 4), "kol985"), 
				new Employee("Alish", 26.1, new Date(100, 2, 9), "fdk651")};
		//Sort.mergeSort(eArr);
		Sort.bubbleSort(eArr);
		for (Employee e : eArr) {
			System.out.println(e);
		}
	}
}