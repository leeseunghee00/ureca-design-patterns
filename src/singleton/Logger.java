package singleton;

import java.time.LocalDateTime;

// 단 하나의 객체를 만들어서 사용한다.
public class Logger {

	// private static Logger logger = new Logger();
	private static Logger logger;

	private Logger() {
	}

	// 메소드로 객체 얻기
	public static Logger getInstance() {
		if (logger == null) {
			logger = new Logger();
		}

		return logger;
	}

	public void log(String message) {
		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.getYear() + "/" + ldt.getMonthValue() + "/" + ldt.getDayOfMonth();
		String time = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();

		System.out.println("[" + date + " " +  time + "] " + message);
	}
}
