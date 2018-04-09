package com.javaex.ex02;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex01 {
	public static void main(String[] args) {

		// 키와 값 둘다 입력해줘야 함 Map<String(키-string이면 문자. int면 숫자. but 대부분 string으로 함), Point(값)>

		Map<String, Point> map = new HashMap<String, Point>();

		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(4, 4);

		map.put("권상우", p1);
		map.put("정우성", p2);
		map.put("이효리", p3);
		map.put("유재석", p4);
		
		System.out.println(map.get("이효리"));
		System.out.println(map.size());
		
		
		/******* 덮어씌움 이효리가 p1이 되버린거임. 권상우가 없어진게 아니라.*******/
		map.put("이효리", p1);
		System.out.println(map.size());
		System.out.println(map.get("이효리"));

	}

}
