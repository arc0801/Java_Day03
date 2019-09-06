package com.arc.control1;

import java.util.Scanner;

public class Iftest2 {
	//main 쓰고 Ctrl+Space bar
	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 입력받아서
		//평균을 계산..
		//평균이 90점 이상이면 우등상 수상 출력
		
		Scanner sc= new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		double avg = 0.0;
		
		
		System.out.println("국어점수");
		kor = sc.nextInt();
		System.out.println("영어점수");
		eng = sc.nextInt();
		System.out.println("수학점수");
		math = sc.nextInt();
		
		avg = (kor + eng + math)/3.0;
		
		
		if(avg>=90) {
			//평균이 95 이상인 학생은 장학금 수상 출력
			if(avg>=95) {
			System.out.println("장학금 수상");
			}
			System.out.println("우등상 수상");
		}
		
		System.out.println(avg);
		System.out.println("졸업");
		
		
	}
}
