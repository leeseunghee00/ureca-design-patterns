package methodchain.practice;

public class Student {

	private static Student student;

	private int id;
	private String name;
	private String major;

	private Student() {
	}

	public Student setId(int id) {
		this.id = id;
		return this;
	}

	public Student setName(String name) {
		this.name = name;
		return this;
	}

	public Student setMajor(String major) {
		this.major = major;
		return this;
	}

	public static Student getInstance() {
		if (student == null) {
			return new Student();
		}

		return student;
	}

	public void info() {
		System.out.println(this.name + " 학생의 학번은 " + this.id + "이고, 전공 학과는 " + this.major + "입니다.");
	}
}
