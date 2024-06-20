package adapter;

public class Test {

	public static void main(String[] args) {
		Legacy legacyFunc = new LegacyImpl();

		System.out.println(legacyFunc.calc(10));

		// New System 처리
		Adapter adapter = new AdapterImpl(legacyFunc);

		System.out.println(adapter.calc(2));
	}
}
