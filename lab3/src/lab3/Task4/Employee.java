package lab3.Task4;

import java.util.Date;

public class Employee extends Person implements Comparable<Object>, Cloneable {
	private double salary;
	private final Date hireDate;
	private final String insuranceNumber;

	public Employee(String name, double salary,
			Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}

	public Employee() {
		this("", 0.0, new Date(), "");
	}

	public double getSalary() { return salary; }
	
	public Date getHireDate() { return hireDate; }
	
	public String getInsuranceNumber() { return insuranceNumber; }
	
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + (int) (salary + 100) 
				+ hireDate.hashCode() + insuranceNumber.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (this.hashCode() == other.hashCode())
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		Double otherSalary = (Double) e.getSalary(),
				thisSalary = (Double) this.getSalary();		
        return thisSalary.compareTo(otherSalary);
    }

	@Override
	public String toString() { return super.toString() 
			+ ", Salary [" + salary + "]" 
			+ ", HireDate [" + hireDate + "]" 
			+ ", InsuranceNumber [" + insuranceNumber + "]"; }
	
	@Override
    public Object clone() throws CloneNotSupportedException {
		 return (Employee) super.clone();
    }
}
