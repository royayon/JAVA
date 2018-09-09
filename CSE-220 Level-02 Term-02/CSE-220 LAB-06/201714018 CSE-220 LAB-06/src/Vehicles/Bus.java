package Vehicles;

public class Bus extends MotorVehicle{
	int numOfPassengers;
	int rentPerPassenger;
	Bus(int _numOfTrips , int _numOfPassengers , int _rentPerPassenger , String _name){
		super(_numOfTrips , _name);
		numOfPassengers = _numOfPassengers;
		rentPerPassenger = _rentPerPassenger;          
	}
	int getTotalFare() {
		return numOfTrips*numOfPassengers*rentPerPassenger;
	}
	String getName() {
		return name;
	}
}
