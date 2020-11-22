package lab3.Task4;

import java.util.*;

public class Manager extends Employee {
	private Vector<Employee> team;
	private int bonus = 0;
	
	public Manager(String name, double salary, Date hireDate,
			String insuranceNumber, Vector<Employee> team) {
		super(name, salary, hireDate, insuranceNumber);
		this.team = team;
	}
	
	public Manager(String name, double salary, Date hireDate,
			String insuranceNumber) {
		this(name, salary, hireDate, insuranceNumber, new Vector<Employee>());
	}
	
	public Manager() {
		super();
		this.team = new Vector<Employee>();
	}

	public void addEmployee(Employee e) {
		team.add(e);
	}
	
	public void giveBonus() { bonus++; }

	public Vector<Employee> getTeam() { return team; }
	
	public int getBonus() { return bonus; }

	@Override
	public int hashCode() {
		return super.hashCode() + team.hashCode() + bonus;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (this.hashCode() == other.hashCode())
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		Manager m = (Manager) o;

		if (super.compareTo(m) == 0) {
			return Integer.signum(bonus - m.getBonus());
		}

		return super.compareTo(m);
    }
	
	@Override
	public String toString() { return super.toString() + ", Team [" + team.toString() + "]"
			+ ", Bonus [" + bonus + "]"; }

	@SuppressWarnings("unchecked")
	@Override
    public Object clone() throws CloneNotSupportedException {
		return new Manager(super.getName(), super.getSalary(), super.getHireDate(), 
				super.getInsuranceNumber(), (Vector<Employee>) team.clone());
    }
}
