package kunchaim;

import java.util.ArrayList;

public abstract class Location {
	String name = "";
	public ArrayList<Leg> connectingLegs = new ArrayList<Leg>(0);
	public ArrayList<Route> r = new ArrayList<Route>();

	public void addConnection(Leg l) {
		this.connectingLegs.add(l);
	}

	public Route cheapestRouteTo(Location loc, String day) {
		r.clear();
		int index = 0;
		findRoutes(loc, day, new Route(), r, this.name);
		if (r.get(0) == null) {
			System.out.println("Invalid Route");
			return null;
		}
		double minCost = r.get(0).totalCost();
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i).totalCost() < minCost) {
				minCost = r.get(i).totalCost();
				index = i;
			}
		}

		return r.get(index);

	}

	private void findRoutes(Location loco, String day, Route rolo,
			ArrayList<Route> r, String origin) {

		if (this.name.equals(loco.name) || this.connectingLegs.size() == 0) {
			r.add(rolo);
			return;
		}

		for (int i = 0; i < this.connectingLegs.size(); i++) {
			Leg l = this.connectingLegs.get(i);
			if (l.daysAvailable.contains(day)) {
				rolo.addLeg(connectingLegs.get(i));
				l.destination.findRoutes(loco, day, rolo, r, origin);
				if ((r.get(r.size() - 1) != null)) {
					if (r.get(r.size() - 1).lastName().equals(loco.name)
							&& origin.equals(r.get(r.size() - 1).firstName())) {
						rolo = new Route();
					} else {
						rolo = new Route();
						r.remove(r.size() - 1);
					}
				}
			}
		}
	} // findRoutes

	public Route minStepsRouteTo(Location loc, String day) {
		r.clear();
		int index = 0;
		findRoutes(loc, day, new Route(), r, this.name);
		if (r.get(0) == null) {
			System.out.println("Invalid Route");
			return null;
		}
		int distance = r.get(0).totalSteps();
		int temp = 0;
		for (int i = 0; i < r.size(); i++) {
			temp = r.get(i).totalSteps();
			if (temp < distance) {
				distance = temp;
				index = i;
			}
		}

		return r.get(index);

	}

	public Route shortestKmRouteTo(Location loc, String day) {
		r.clear();
		int index = 0;
		findRoutes(loc, day, new Route(), r, this.name);
		if (r.get(0) == null) {
			System.out.println("Invalid Route");
			return null;
		}
		double distance = r.get(0).totalDistance();
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i).totalDistance() < distance) {
				distance = r.get(i).totalDistance();
				index = i;
			}
		}
		return r.get(index);

	}

	@Override
	public String toString() {
		return this.name;
	}

}
