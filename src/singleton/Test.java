package singleton;

public class Test {
	public static void main(String[] args) {

		Logger logger = Logger.getInstance();

		System.out.println(logger);

		logger.log("첫 번째 로그입니다.");

		m();
	}

	public static void m() {
		Logger logger = Logger.getInstance();

		System.out.println(logger);

		logger.log("두 번째 로그입니다.");
	}
}