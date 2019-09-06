package com.arc.control3;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		// for(초기식;조건식;증감식){}
		
		/*
		 * System.out.println("hi");
		 * System.out.println("hi");
		 * System.out.println("hi");
		 * System.out.println("hi");
		 * System.out.println("hi");
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수를 입력하세요");
		int count=sc.nextInt();
		//초기식을 미리 선언하고 가도 됨 -> for(;조건식;증감식){}
		
		
		
		//i++ 대신에 i=i+2 써도 됨
		for(int i=0;i<count;i++) {
			System.out.println("hi");
		}
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
		
		
	}//m ed
}
