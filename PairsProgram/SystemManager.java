package kunchaim;

import java.util.ArrayList;

public class SystemManager {
	
	public ArrayList<Location> locations = new ArrayList<Location>(0);
	
	public void addLocation(Location loc) {
		this.locations.add(loc);
	}

	public void addLeg(Leg leg) {
		this.locations.get(locations.indexOf(leg.origin)).addConnection(leg);
	}

	public Location findLocation(String s) {
		for (Location l : locations) {
			if (l.name.equals(s)) {
				return l;
			}
		}
		return null;
	}

	public Route findCheapestRoute(Location origin, Location destination, String day) {
		return origin.cheapestRouteTo(destination, day);
	}

	public Route findMinStepsRoute(Location origin, Location destination, String day) {
		return origin.minStepsRouteTo(destination, day);
	}

	public Route findShortestKmRoute(Location origin, Location destination, String day) {
		return origin.shortestKmRouteTo(destination, day);
	}

}
