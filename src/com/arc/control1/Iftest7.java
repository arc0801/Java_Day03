package com.arc.control1;

import java.util.Scanner;

public class Iftest7 {

	public static void main(String[] args) {
		//국어 영어 수학 입력
		//총점 평균 계산
		//평균이 90점 이상이면 A 출력
		//평균이 80점 이상이면 B 출력
		//평균이 70점 이상이면 C 출력
		//평균이 60점 이상이면 D 출력
		//그 외 나머지는 F 출력
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avr = 0.0;
		
		
		System.out.println("국어 입력");
		kor = sc.nextInt();
		System.out.println("영어 입력");
		eng = sc.nextInt();
		System.out.println("수학 입력");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avr = sum / 3.0;
		
		System.out.println(avr);
		
		String result = "";
		
		if(avr >= 90) {
			//System.out.println("A");
			result = "A";
		}else if(avr >= 80) {
			//System.out.println("B");
			result = "B";
		}else if(avr >= 70) {
			//System.out.println("C");
			result = "C";
		}else if(avr >= 60) {
			//System.out.println("D");
			result = "D";
		}else {
			//System.out.println("F");
			result = "F";
		}
		
		System.out.println(result);
		
	}//main 끝
}
