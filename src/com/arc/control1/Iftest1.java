package com.arc.control1;

public class Iftest1 {

	public static void main(String [] args) {
		/**
		 * 
		 * 단일 if
		 * 
		 * 형식
		 * if(조건식) {}
		 */
		int age = 18;
		String result = "미성년";
		String result2 = "10대가 아닙니다";
		
		if(age>=20) {
			result = "성년";
		}
		
		//10대 판별 코드
		
		if(age>=10 && age<20) {
			result2 = "10대";
		}
		
		
		
		System.out.println(result);
		System.out.println(result2);
		
		
	}
}
