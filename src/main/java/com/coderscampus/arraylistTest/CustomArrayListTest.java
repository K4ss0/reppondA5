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

		sut.add(10);
		sut.add(25);
		sut.add(35);
		
		boolean result = sut.add(1, 15);
		
		assertEquals(true, result);
		assertEquals(4, sut.getSize());
		assertEquals(Integer.valueOf(15), sut.get(1));
		
		assertEquals(Integer.valueOf(10), sut.get(0));
		assertEquals(Integer.valueOf(25), sut.get(2));
		assertEquals(Integer.valueOf(35), sut.get(3));
		
		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(5,25));
		assertEquals(4, sut.getSize());
	}
	
    public void should_return_size_of_custom_list() {
        CustomArrayList<Integer> sut = new CustomArrayList<>();

        assertEquals(0, sut.getSize());

        sut.add(10);
        sut.add(20);
        sut.add(30);

        assertEquals(3, sut.getSize());
    }
    @Test
    public void should_return_element_at_index() {
        CustomArrayList<Integer> sut = new CustomArrayList<>();

        sut.add(10);
        sut.add(20);
        sut.add(30);
        sut.add(40);

        assertEquals(Integer.valueOf(10), sut.get(0));
        assertEquals(Integer.valueOf(20), sut.get(1));
        assertEquals(Integer.valueOf(30), sut.get(2));
        assertEquals(Integer.valueOf(40), sut.get(3));

        assertThrows(IndexOutOfBoundsException.class, () -> sut.get(4));

        assertThrows(IndexOutOfBoundsException.class, () -> sut.get(-1));
    }

    @Test
    public void should_remove_item_at_index() {
        CustomArrayList<Integer> sut = new CustomArrayList<>();

        sut.add(10);
        sut.add(20);
        sut.add(30);
        sut.add(40);

        Integer removedItem = sut.remove(1);

        assertEquals(Integer.valueOf(20), removedItem);

        assertEquals(3, sut.getSize());

        assertEquals(Integer.valueOf(10), sut.get(0));
        assertEquals(Integer.valueOf(30), sut.get(1));
        assertEquals(Integer.valueOf(40), sut.get(2));

        assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(3));

        assertEquals(3, sut.getSize());
    }

}
