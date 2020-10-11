package com.rubypaper.junit;

public class MyVector {

	protected Object elementData[];
	
	protected int elementCount;

	public MyVector(int intialCapacity) {
	
		this.elementData = new Object[intialCapacity];
		
	}
	
	public MyVector() {
		this(10);
	}
	
	public int size() {
		//return elementCount;
		synchronized (this) {
			return elementCount;
		}
	}
	
	public boolean isEmpty() {
		return elementCount == 0;
	}
	
	public boolean contains(Object elem) {
		return indexOf(elem) >= 0;
	}
	
	public int indexOf(Object elem) {
		for (int i = 0; i < elementCount; i++) {
			if (elem.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public Object elementAt(int index) {
		//return elementData[index];
		synchronized (this) {
			return elementData[index];
		}
	}
	
	public void addElement(Object obj) {
		synchronized (this) {
			ensureCapacityHelper(elementCount + 1);
			elementData[elementCount++] = obj;	
		}
		
	}
	
	public void ensureCapacityHelper(int minCapacity) {
		int oldcapacity = elementData.length;
		if (minCapacity > oldcapacity) {
			
			Object oldData[] = elementData;
			int newCapacity = oldcapacity *2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			elementData = new Object[newCapacity];
			System.arraycopy(oldData, 0, elementData, 0, elementCount);
		}
	}
}
