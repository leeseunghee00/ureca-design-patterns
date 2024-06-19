package methodchain;

public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		calc.setFirst(10);
		calc.setSecond(5);

		calc.showAdd();
		calc.showSub();

		// method chain
		calc.setFirst(3).setSecond(5).showAdd();

		// StringBuilder
		StringBuilder sb = new StringBuilder();

		sb.append("123")
			.append("456")
			.append("789");


	}
}
