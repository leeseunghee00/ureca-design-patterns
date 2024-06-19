package factory.practice;

public class DepartmentFactory {

	public static Department getDepartment(String major) {
		Department department = null;

		switch (major) {
			case "Computer":
				department = new Computer();
				break;
			case "English":
				department = new English();
				break;
			case "Medical":
				department = new Medical();
				break;
		}

		return department;
	}

}
