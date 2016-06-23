package kunchaim;

public class TruckLeg extends Leg {

	TruckLeg(Location origin, Location destination, int distanceInKm,
			String days) {
		super(origin, destination, distanceInKm, days, .58, validate(origin,
				destination, distanceInKm, days));

	}

	private static boolean validate(Location origin, Location destination, int distanceInKm, String days) {
		if (!(days.contains("M") || days.contains("T") || days.contains("W")
				|| days.contains("R") || days.contains("F")
				|| days.contains("S") || days.contains("U"))) {
			return false;
		}
		if ((origin instanceof TruckDepot || origin instanceof Airport)
				&& (destination instanceof TruckDepot || destination instanceof Airport)) {
			return true;
		}
		return false;
	}

}
