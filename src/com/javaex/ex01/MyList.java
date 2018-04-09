package com.javaex.ex01;

/****************** Generic ***********************/
public class MyList<T> {// 알파벳 아무거나 해도 됨.
	// 틀은 T지만 Circle이나 Point라고 찍는 순간 이 밑에 T들이 다 Circle이나 Point 등으로 바뀜.
	private T[] oArray;
	private int crtPos;

	/******* Object로 놓고 그냥 T로 형변환 시켜줘야함 **********/
	public MyList() {
		this.oArray = (T[]) new Object[3];
		// this.pArray = new Point[3]; //point전용
		this.crtPos = 0;
	}

	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	/*
	 * //point 전용 public void add(Point o) { pArray[crtPos] = o; crtPos++; }
	 */

	public int size() {
		return crtPos;
	}

}

/*
 * public class MyList {
 * 
 * //private Point[] pArray; private Object[] oArray; private int crtPos;
 * 
 * public MyList() { this.oArray = new Object[3]; //this.pArray = new Point[3];
 * //point전용 this.crtPos = 0; }
 * 
 * public void add(Object o) { oArray[crtPos] = o; crtPos++; } //point 전용 public
 * void add(Point o) { pArray[crtPos] = o; crtPos++; }
 * 
 * public int size() { return crtPos; }
 * 
 * }
 */
