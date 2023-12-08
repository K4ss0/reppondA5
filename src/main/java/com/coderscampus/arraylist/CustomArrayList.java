package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private Integer size = 0;
	
	
	@Override
	public boolean add(T item) {
		if(size == items.length) {
			resizeArray();
		}
		items[size++] = item;
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
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= size || index <0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " +size);
		}
		// TODO Auto-generated method stub
		return (T) items[index];
	}
	
}
