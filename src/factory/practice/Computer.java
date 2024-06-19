package factory.practice;

public class Computer implements Department {

	@Override
	public void info() {
		System.out.println("컴퓨터공학과 입니다.💻");
	}
}
