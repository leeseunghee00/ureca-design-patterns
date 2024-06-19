package factory;

public class TransportationFactory {

	public static Transportation getTransportation(String clsf) {
		Transportation ts = null;

		switch (clsf) {
			case "Airplane":
				ts = new Airplane();
				break;
			case "Car":
				ts = new Car();
				break;
			case "SportsCar":
				ts = new SportsCar();
				break;
			case "Helicopter":
				ts = new Helicopter();
				break;
		}

		return ts;
	}
}
