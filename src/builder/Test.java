package builder;

public class Test {

	public static void main(String[] args) {
		// NormalBook nBook = new NormalBook("700", "천명관", "고래");	// 순서에 맞지 않는 잘못된 값 전달

		BuilderBook bBook = BuilderBook.builder()
			.isbn("700")
			.title("고래")
			.author("천명관");

		System.out.println(bBook);

		// Builder Pattern
		Board board = new Board.Builder()
			.title("제목")
			.content("내용")
			.category("카테고리")
			.build();

		System.out.println(board);
	}
}
