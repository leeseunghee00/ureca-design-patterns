package factory;

public class Car implements Transportation {

	@Override
	public void move() {
		System.out.println("자동차가 달립니다.🚗");
	}
}
