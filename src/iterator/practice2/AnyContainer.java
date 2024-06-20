package iterator.practice2;

public class AnyContainer<T> implements Container<T> {

	T[] array;

	@Override
	public Iterator<T> getIterator() {
		return new AnyIterator();
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	private class AnyIterator implements Iterator<T> {

		int index;

		@Override
		public boolean hasNext() {
			if (index < array.length){
				return true;
			}

			return false;
		}

		@Override
		public T next() {
			if (this.hasNext()){
				return array[index++];
			}

			return null;
		}
	}
}
