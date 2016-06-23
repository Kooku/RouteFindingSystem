package kunchaim;

import java.util.ArrayList;

public class Route {
	public ArrayList<Leg> route = new ArrayList<Leg>(0);

	String lastName() {
		return route.get(route.size()-1).destination.name;
	}
	String firstName() {
		return route.get(0).origin.name;
	}
	double totalCost() {
		double totalC = 0;
		for (int i = 0; i < route.size(); i++) {
			totalC += this.route.get(i).distance * this.route.get(i).costPerKm;
		}

		return totalC;
	}

	double totalDistance() {
		double totalD = 0;
		for (int i = 0; i < route.size(); i++) {
			totalD += this.route.get(i).distance;
		}
		return totalD;
	}

	int totalSteps() {
		return this.route.size();
	}

	void addLeg(Leg l) {
		this.route.add(l);
	}

	@Override
	public String toString() {
		String str = "";
		for (Leg l : route) {
			str += l.origin.name + " " + l.destination.toString() + "\n ";
		}
		return str;
	}

}
