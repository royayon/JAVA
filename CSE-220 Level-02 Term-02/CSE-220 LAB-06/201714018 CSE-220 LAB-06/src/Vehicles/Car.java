package Vehicles;

public class Car extends MotorVehicle{
	int rentPerTrip;
	Car(int _numOfTrips , int _rentPerTrip , String _name){
		super(_numOfTrips , _name);
		rentPerTrip = _rentPerTrip;
	}
	int getTotalFare() {
		return numOfTrips*rentPerTrip;
	}
	String getName() {
		return name;
	}
}
