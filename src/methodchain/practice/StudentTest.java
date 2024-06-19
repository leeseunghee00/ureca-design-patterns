package methodchain.practice;

public class StudentTest {

	public static void main(String[] args) {
		Student student = Student.getInstance();

		// method chain
		student
			.setId(1)
			.setName("이승희")
			.setMajor("정보통신공학과");

		student.info();
	}
}
