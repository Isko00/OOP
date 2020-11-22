package lab3.Task2;

public class Volvo implements Car {
	int number;
	
	public Volvo(int number) {
		this.number = number;
	}
	
	public Volvo() {
		this(0);
	}
	
	@Override
	public void move() {
		System.out.println("*moves as car.*");
	}
	
	@Override
	public void fillUp() {
		System.out.println("*fill ups fuel.*");
	}
	
	public void use() {
		fillUp();
		move();
	}
}