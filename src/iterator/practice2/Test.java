package iterator.practice2;

public class Test {

	public static void main(String[] args) {
		AnyContainer<String> container = new AnyContainer<>();
		String[] arr = {"Hello", "Iterator", "Patterns"};
		Iterator<String> iter = container.getIterator();

		container.setArray(arr);

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
