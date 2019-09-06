package com.arc.control2;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		//국어 영어 수학 입력
		//총점, 평균 계산
		//평균이 90점 이상 A
		//평균이 80점 이상 B
		//평균이 70점 이상 C
		//평균이 60점 이상 D
		//그 외 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		int avr = sum/3;
		
		System.out.println(avr);
		
		switch(avr/10) {
			case 10:
			case 9:
				System.out.println("A 학점");
				break;
			case 8:
				System.out.println("B 학점");
				break;	
			case 7:
				System.out.println("C 학점");
				break;
			case 6:
				System.out.println("D 학점");
				break;	
			default:
				System.out.println("F 학점");
		}//switch ed
		
		
	}//main ed
}
