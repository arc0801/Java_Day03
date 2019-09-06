package com.arc.control1;

import java.util.Scanner;

public class Iftest5 {

	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 받아서
		//평균이 60점 이상이면서
		// 과목당 점수가 40점 이상이어야 pass
		//아니면 fail
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		double sum = 0;
		double avr = 0;
		
		System.out.println("국어 점수");
		kor = sc.nextInt();
		System.out.println("영어 점수");
		eng = sc.nextInt();
		System.out.println("수학 점수");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avr = sum/3;
		
		System.out.println(avr);
		
		if(avr>=60 && kor>=40 && eng>=40 && math>=40) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		
		
	}
}
