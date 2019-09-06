package com.arc.control1;

import java.util.Scanner;

public class Iftest3 {

	public static void main(String[] args) {
		/**
		 * 월급여와 나이를 입력
		 * 급여 
		 * 200만 이상~300만 미만 소득세 2.2%
		 * 300만 이상~400만 미만 소득세 2.9%
		 * 400이상~			소득세 3.5%
		 * 
		 * 20세 이상 30세 미만 1.2%
		 * 30세 이상 40세 미만 2.0%
		 * 40세 이상	~	  4.0%
		 * 
		 * 300-9 : 291만
		 * 나이 30	291*0.02
		 * 
		 * 원급여, 나이, 실급여 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int pay = 0;
		int age = 0;
		int money1 = 0;
		int money2 = 0;
		//int tax1 = 0;
		//int tax2 = 0;
		
		System.out.println("월급여");
		pay = sc.nextInt();
		System.out.println("나이");
		age = sc.nextInt();
		
		
		if(pay>=2000000 && pay<3000000) {
			money1 = (int)(pay-pay*0.022);
			//tax1 = 0.022;
		}
		
		if(pay>=3000000 && pay<4000000) {
			money1 = (int)(pay-pay*0.03);
			//tax1=0.03;
		}
		
		if(pay>=4000000) {
			money1 = (int)(pay-pay*0.035);
			//tax1=0.035;
		}
		
		if(age>=20 && age<30) {
			money2 = (int)(money1-money1*0.012);
			//tax2=0.012;
		}
		if(age>=30 && age<40) {
			money2 = (int)(money1-money1*0.02);
			//tax2=0.02;
		}
		if(age>=40) {
			money2 = (int)(money1-money1*0.04);
			//tax2=0.04;
		}
		
		//money1 = pay1-pay1*tax1;
		//money2 = money1-money1*tax2;
		
		System.out.println("원급여 : "+pay+" 원");
		System.out.println("나이 : "+age+" 세");
		System.out.println("실급여 : "+money2+" 원");
		
	}
}
