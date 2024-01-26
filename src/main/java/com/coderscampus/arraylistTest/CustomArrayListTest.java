package com.coderscampus.arraylistTest;

import static org.junit.jupiter.api.Assertions.*;
import com.coderscampus.arraylist.*;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	public void should_add_item_to_list() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		Integer item = 10;
		boolean result = sut.add(item);
		assertEquals(true, result);
		assertEquals(1,sut.getSize());
		assertEquals(item, sut.get(0));
		}

	@Test
	public void should_add_item_at_index() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		Integer item = 10;
		int index = 0;
		
		try {
			sut.add(index, item);
		}catch(IndexOutOfBoundsException e) {
			assertEquals("Index: "+ index +", Size: 0", e.getMessage());
		}

		sut.add(15);
		sut.add(25);
		sut.add(35);
		
		boolean result = sut.add(index, item);
		
		assertEquals(true, result);
		System.out.println(result);
		assertEquals(4, sut.getSize());
		assertEquals(item, sut.get(index));
		
		assertEquals(Integer.valueOf(10), sut.get(0));
		assertEquals(Integer.valueOf(15), sut.get(1));
		assertEquals(Integer.valueOf(25), sut.get(2));
		assertEquals(Integer.valueOf(35), sut.get(3));
		
	}
//	     * This method should add a new item into the <code>CustomList</code> at the
//
//	     * specified index (thus shuffling the other items to the right). If the index doesn't
//
//	     * yet exist, then you should throw an <code>IndexOutOfBoundsException</code>.
//
//	     * @param index the spot in the zero-based array where you'd like to insert your
//
//	     *        new item
//
//	     * @param item the item that will be inserted into the <code>CustomList</code>
//
//	     * @return <code>true</code> when the item is added
//
//	     * @throws IndexOutOfBoundsException
//
//	     */
//
//	    boolean add (int index, T item) throws IndexOutOfBoundsException;
//
//	   
//	    /**
//
//	     * This method should return the size of the <code>CustomList</code>
//
//	     * based on the number of actual elements stored inside of the <code>CustomList</code>
//
//	     * @return an <code>int</code> representing the number of elements stored in the <code>CustomList</code>
//
//	     */
//
//	    int getSize();
//
//	   
//	    /**
//
//	     * This method will return the actual element from the <code>CustomList</code> based on the
//
//	     * index that is passed in.
//
//	     * @param index represents the position in the backing <code>Object</code> array that we want to access
//
//	     * @return The element that is stored inside of the <code>CustomList</code> at the given index
//
//	     * @throws IndexOutOfBoundsException
//
//	     */
//
//	    T get(int index) throws IndexOutOfBoundsException;
//
//	   
//	    /**
//
//	     * This method should remove an item from the <code>CustomList</code> at the
//
//	     * specified index. This will NOT leave an empty <code>null</code> where the item
//
//	     * was removed, instead all other items to the right will be shuffled to the left.
//
//	     * @param index the index of the item to remove
//
//	     * @return the actual item that was removed from the list
//
//	     * @throws IndexOutOfBoundsException
//
//	     */
//
//	    T remove(int index) throws IndexOutOfBoundsException;
//
//	}
	

}
