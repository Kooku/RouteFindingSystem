package kunchaim;

public class Airport extends Location {
	Airport(String name) {
		if (validate(name))
			this.name = name;
	}

	private boolean validate(String name) {
		name.toUpperCase();
		if (name.length() == 3) {
			return true;
		}
		return false;
	}
}
