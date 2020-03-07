package com.epam.custom;

import java.util.*;

public class customList<E> extends AbstractList<E>
{
	private int size = 0;
	private Object elements[];
	public customList()
	{
		elements = new Object[10];
	}
	public boolean add(E e) {
		// TODO Auto-generated method stub
		if(size == elements.length)
			ensureCapacity();
		elements[size++] = e;
		return true;
	}
	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		return (E) elements[index];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return elements.length;
	}
	private void ensureCapacity()
	{
		elements = Arrays.copyOf(elements, elements.length*2);
	}
	@SuppressWarnings("unchecked")
	@Override
	public E remove(int i)
	{
		Object item = elements[i];
		size--;
		System.arraycopy(elements, i+1, elements, i, elements.length - i - 1);
		return (E) item;
	}
	public void print()
	{
		for(int i=0; i<size; i++)
			System.out.print(elements[i] + ", ");
		System.out.println("");
	}
}
