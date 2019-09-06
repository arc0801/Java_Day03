package com.arc.control1;

import java.util.Scanner;

public class Iftest9 {

	public static void main(String[] args) {
		
		//점심메뉴 고르기
		// 짜장면(5000), 돈까스(8000), 햄버거(4000), 라면(3000)
		//인원수 입력
		//최종 결제 금액 출력
		//4명당 1인분 무료.
		
		Scanner sc = new Scanner(System.in);
		/*
		String name = "iu";
		String name2 = sc.next();
		char ch = 'a';
		char ch2 = 'a';
		System.out.println(ch == ch2);
		System.out.println(name == name2);
		*/
		
		System.out.println("1. 짜장면");
		System.out.println("2. 돈까스");
		System.out.println("3. 햄버거");
		System.out.println("4. 라면");
		System.out.println("5. 종료");
		
		int select = sc.nextInt();
		int money = 0;
		int money1 = 0;
		String menu= "";
		
		if(select == 1) {
			money1 = 5000;
			menu = "짜장면";
		}else if(select == 2) {
			money1 = 8000;
			menu = "돈까스";
		}else if(select == 3) {
			money1 = 4000;
			menu = "햄버거";
		}else if(select == 4) {
			money1 = 3000;
			menu = "라면";
		}else {
			System.out.println("선택된 메뉴가 없습니다.");
		}
		
		System.out.println("인원 수를 입력하세요.");
		int person = sc.nextInt();
		
		money = money1*person;
		
		money = money - person/4*money1;
		
		
		System.out.println("메뉴 : "+menu);
		System.out.println("결제금액 : "+money+" 원"); //(money1*person - person/4*money1)
		
		
		
	}//main end
}
