package oops;

public class HondaCar implements CarInterface, BusInterface{

	@Override
	public void start() {
		System.out.println("Honda car to be started");
		
	}

	@Override
	public void stop() {
		System.out.println("Honda car to be stopped");
		
	}

	@Override
	public void fuelChk() {
		System.out.println("Honda car fuel check to be done");
		
	}

	@Override
	public void Driver() {
		System.out.println("Honda car manually driven");
		
	}

	@Override
	public void Wheels() {
		System.out.println("Honda car having 4 wheels");
		
	}

	@Override
	public void Doors() {
		System.out.println("Honda car having 4 doors");
		
	}
	

}
