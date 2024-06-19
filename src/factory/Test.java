package factory;

public class Test {

	public static void main(String[] args) {
		Transportation ts1 = TransportationFactory.getTransportation("Airplane");

		ts1.move();

		Transportation ts2 = TransportationFactory.getTransportation("Car");

		ts2.move();
	}
}
