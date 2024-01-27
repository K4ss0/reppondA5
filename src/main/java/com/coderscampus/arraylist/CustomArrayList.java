package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private Integer size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			resizeArray();
		}

		items[size++] = item;
		return true;
	}

	@Override
	public boolean add(int index, T item) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		if (size == items.length) {
			resizeArray();
		}

		System.arraycopy(items, index, items, index + 1, size - index);
		items[index] = item;
		size++;
		return true;
	}

	private void resizeArray() {
		int newSize = items.length * 2;
		Object[] newArray = new Object[newSize];
		System.arraycopy(items, 0, newArray, 0, size);
		items = newArray;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return (T) items[index];
	}

	public T remove(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		@SuppressWarnings("unchecked")
		T removedItem =(T) items[index];
		
		System.arraycopy(items, index + 1, items, index, size - index - 1);
		
		items[size - 1] = null;
		
		size--;
		return removedItem;
	}

}
