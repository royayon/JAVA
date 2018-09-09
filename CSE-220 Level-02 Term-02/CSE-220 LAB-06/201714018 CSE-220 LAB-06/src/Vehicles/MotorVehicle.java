package Vehicles;

public abstract class MotorVehicle extends vehicle{
	int numOfTrips;
	String name;
	MotorVehicle(int _numOfTrips , String _name){
		numOfTrips = _numOfTrips;
		name = _name;
	}
	
}
