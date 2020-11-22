package lab3.Task4;

import java.util.*;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Vector<Employee> v1 = new Vector<Employee>();
		Vector<Manager> v2 = new Vector<Manager>();

		Employee e1 = new Employee("Alisher", 22.5, new Date(101, 6, 12), "ijn543");
		Employee e2, e3 = new Employee("Rufat", 19.3, new Date(101, 9, 4), "kol985");
		Manager m1 = new Manager("Islam", 12.5, new Date(100, 8, 7), "qwe123", new Vector<Employee>());
		Manager m2, m3 = new Manager("Vlad", 9.3, new Date(101, 9, 4), "rty321", new Vector<Employee>());

		try {
			e2 = (Employee) e1.clone();
			e2.setName("Kazybek");
			e2.setSalary(11.1);

			m2 = (Manager) m1.clone();
			m2.setName("Aba");
			m2.setSalary(11.1);
			m2.giveBonus();
		} catch (CloneNotSupportedException e) {
			e2 = null;
			m2 = null;
			e.printStackTrace();
		}

		v1.add(e1);
		v1.add(e2);
		v1.add(e3);

		v1.add(m1);
		v1.add(m2);
		v1.add(m3);

		Collections.sort(v2, new NameComparator());
		//Collections.sort(v2, new HireDateComparator());

		Collections.sort(v1, new NameComparator());
		//Collections.sort(v1, new HireDateComparator());
	
		for (Employee e : v1) {
			System.out.println(e);
		}
/*
		for (Manager m : v2) {
			System.out.println(m);
		}
*/
	}
}