package kunchaim;

public abstract class Leg {
	Location origin;
	Location destination;
	String daysAvailable;
	int distance;
	double costPerKm;

	Leg(Location origin, Location destination, int distanceInKm, String days,
			double costPerKm, boolean b) {
		if (b) {
			this.origin = origin;
			this.destination = destination;
			this.daysAvailable = days;
			this.costPerKm = costPerKm;
			this.distance = distanceInKm;
		} else
			System.out.println("Invalid Leg");
	}

	Location getOrigin() {
		return this.origin;
	}

	Location getDestination() {
		return this.destination;
	}

	String getDays() {
		return this.daysAvailable;
	}

	int getDistance() {
		return this.distance;
	}

	double getCost() {
		return this.costPerKm * this.distance;
	}
	
	

}
