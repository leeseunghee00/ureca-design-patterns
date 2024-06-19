package iterator.practice;

public class StudentContainer implements Container {

	String[] strArray = {"이승희", "류금정", "김민지"};

	@Override
	public Iterator getIterator() {
		return new StringIterator();
	}

	private class StringIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < strArray.length){
				return true;
			}

			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()){
				return strArray[index++];
			}

			return null;
		}
	}
}
