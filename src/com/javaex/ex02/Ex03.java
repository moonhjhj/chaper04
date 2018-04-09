package com.javaex.ex02;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	/************* set : 순서 없음. 중복 없음. *****************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);

		}

		for (int lottoNo : set) {
			System.out.print(lottoNo + " ");
		}
	}

}
