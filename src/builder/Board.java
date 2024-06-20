package builder;

public class Board {

	private final String title;
	private final String content;
	private final String category;

	private Board(Builder builder) {
		this.title = builder.title;
		this.content = builder.content;
		this.category = builder.category;
	}

	@Override
	public String toString() {
		return "Board[" +
			"title='" + title + '\'' +
			", content='" + content + '\'' +
			", category='" + category + '\'' +
			']';
	}

	// Board Setter 작업 수행 & build() -> 객체 생성
	public static class Builder {
		private String title;
		private String content;
		private String category;

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder content(String content) {
			this.content = content;
			return this;
		}

		public Builder category(String category) {
			this.category = category;
			return this;
		}

		public Board build() {
			return new Board(this);
		}
	}
}
