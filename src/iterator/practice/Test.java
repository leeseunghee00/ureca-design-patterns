package iterator.practice;

public class Test {

	public static void main(String[] args) {
		StudentContainer container = new StudentContainer();
		Iterator iter = container.getIterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
