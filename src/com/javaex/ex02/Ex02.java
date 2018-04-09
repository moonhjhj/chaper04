package com.javaex.ex02;

import java.util.LinkedList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		/********* ArrayList를 LinkedList로 변경.(이 밑에 코드만 수정해도 됨. 인터페이스가 같아서 오류 안남) ************/
		List<Point> list = new LinkedList<Point>(); // 섞어쓰기. 왼쪽 : interface만 있는애들(제목만 있는애들) 오른쪽 : 실제 구현하는 애들.

		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(4, 6);

		/******* add 해줘야 리스트에 들어감 *******/
		list.add(p1);
		list.add(p2);
		list.add(p3);

		/******** size : 갯수 알려주는 함수 ********/
		System.out.println(list.size());

		/****** 꺼내오기 *******/
		// list.get(1); //배열이니까 배열 순서
		Point p = list.get(1); // point형으로 가져옴
		System.out.println(p);// p에 있는 toString을 뒤짐. p2의 toString 조회.
		System.out.println(p.toString());// 위랑 같은 표현. 보통 toString 붙여서 많이 씀

		System.out.println("============================");
		/************** 한번에 출력 **************/
		/*
		 * for (int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i).toString()); }
		 * 
		 * System.out.println("============================");
		 */

		/********* 향상된 for문 (배열이나 리스트에서 처음부터 끝까지 돌릴 때) **************/
		/*
		 * for (Point pp : list) { // 왼쪽 : 하나 담을 그릇 오른쪽 : 전체
		 * System.out.println(pp.toString()); }
		 */

		/***********
		 * 리스트 데이터 삭제 후 출력 (p2의 데이터가 아니라 point 배열에 담겨있는 p2의 주소값만 지움)(지우고 나면 공백배열 없이 앞으로
		 * 밀어놓음)
		 **********/
		list.remove(1);
		for (Point pp : list) {
			System.out.println(pp.toString());
		}
		System.out.println("============================");

		/*********** 지운거 다시 넣기 (맨 뒤에 들어감) ************/
		/*
		 * list.add(p2); for (Point pp : list) { System.out.println(pp.toString()); }
		 */
		/*********** 지운거 다시 넣기 (원하는 자리-가운데 에 넣기) ************/
		list.add(1, p2);
		for (Point pp : list) {
			System.out.println(pp.toString());
		}

	}

}
