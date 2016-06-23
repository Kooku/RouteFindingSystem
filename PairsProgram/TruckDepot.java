package kunchaim;

public class TruckDepot extends Location {
	TruckDepot(String name) {
		if (validate(name))
			this.name = name;
	}

	private boolean validate(String name) {
		name.toUpperCase();
		if (name.length() == 8)
			return true;
		return false;
	}

}
