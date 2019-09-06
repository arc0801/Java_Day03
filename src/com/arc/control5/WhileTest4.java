package com.arc.control5;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		//1. 성적 입력 - 국어, 영어, 수학
		//2. 평균 출력
		//3. 총점 출력
		//4. 종료
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		int avr = 0;
		boolean check = true;
		
		while(check) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 평균 출력");
			System.out.println("3. 총점 출력");
			System.out.println("4. 종       료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("국어 점수를 입력하세요.");
				kor = sc.nextInt();
				System.out.println("수학 점수를 입력하세요.");
				eng = sc.nextInt();
				System.out.println("영어 점수를 입력하세요.");
				math = sc.nextInt();
			}else if(select==2) {
				avr = (kor+eng+math)/3;
				System.out.println("평균 : "+avr+"점");
			}else if(select==3) {
				sum = kor+eng+math;
				System.out.println("총점 : "+sum+"점");
			}else {
				System.out.println("종료");
				break;
			}//if
		
		}//while
			
			/*
			switch(select) {
				case 1:
					System.out.println("국어 점수를 입력하세요.");
					kor = sc.nextInt();
					System.out.println("수학 점수를 입력하세요.");
					eng = sc.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					math = sc.nextInt();
					sum = kor+eng+math;
					avr = sum/3;
					break;
				case 2:
					//avr = (kor+eng+math)/3;
					System.out.println("평균 : "+avr+"점");
					break;
				case 3:
					//sum = kor+eng+math;
					System.out.println("총점 : "+sum+"점");
					break;
				default:
					System.out.println("종료");
					//check=false;
					check=!check;
			}//switch
			*/
			
			
			/*********
			 * ctrl+A => ctrl+I(전체 정렬)
			 *********/
			
			
		
	}//main
}
