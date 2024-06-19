package iterator;

public class StringContainer implements Container {

	String[] strArray = {"Hello", "Iterator", "Pattern"};

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
			// return strArray[index++];

			if (this.hasNext()){
				return strArray[index++];
			}

			return null;
		}
	}
}
