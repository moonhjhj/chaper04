package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		MyList<CIrcle> myList = new MyList<CIrcle>(); // 틀은 범용으로 만들어놓음. 쓸 때 그 전용으로 쓰기 위한 방법. 이 다음줄부터는 add를 point만 할 수 있음

		CIrcle c1 = new CIrcle(5);
		CIrcle c2 = new CIrcle(8);
		myList.add(c1);
		myList.add(c2);

		MyList<Point> myList2 = new MyList<Point>();

		Point p1 = new Point(2, 2);
		myList2.add(p1);
		
		
		
		System.out.println(myList.size());
		System.out.println(myList2.size());

		/*********** point 전용 ***********/
		/*
		 * Point p1 = new Point(2, 2); Point p2 = new Point(5, 5); Point p3 = new
		 * Point(9, 5);
		 * 
		 * MyList myList = new MyList(); myList.add(p1); myList.add(p2); myList.add(p3);
		 * 
		 * System.out.println(myList.size());
		 */
	}

}
