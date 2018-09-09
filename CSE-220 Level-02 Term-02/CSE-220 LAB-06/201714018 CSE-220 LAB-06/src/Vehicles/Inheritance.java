package Vehicles;

public class Inheritance {
	public static void main(String[] args) {
		Car car1 = new Car(2 , 10 , "Car1");
		Bus bus1 = new Bus(2 , 20 , 10 , "Bus1");
		
		printTotalIncome(car1);
		printTotalIncome(bus1);
	}
	static void printTotalIncome(vehicle obj) {
		System.out.println("The total fare of " + obj.getName() + " is " + obj.getTotalFare());
	}

}
