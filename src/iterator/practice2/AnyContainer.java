package iterator.practice2;

public class AnyContainer<T> implements Container<T> {

	T[] strArray;

	@Override
	public Iterator<T> getIterator() {
		return new AnyIterator();
	}

	public void setStrArray(T[] array) {
		this.strArray = array;
	}

	private class AnyIterator implements Iterator<T> {

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
