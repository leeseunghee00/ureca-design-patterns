package factory.practice;

public class Test {

	public static void main(String[] args) {
		Department department = DepartmentFactory.getDepartment("Computer");

		department.info();
	}
}
