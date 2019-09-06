package com.arc.control4;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		//0분 0초 ~ 59분 59초
		//분, 초를 입력
		//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 분인지 입력하세요.");
		int min=sc.nextInt();
		System.out.println("몇 초인지 입력하세요.");
		int sec=sc.nextInt();
		
		
		for(int i=0;i<60;i++) {
			
			for(int j=0;j<60;j++) {
				System.out.println(i+" 분 "+j+" 초");
				if(i==min && j==sec) {
					i=60;
					j=60;
				}
			}
			
		}
		
		System.out.println("===");
		
		//int check=0;
		//boolean check=false;
		
		for(int i=0;i<60;i++) {
			
			for(int j=0;j<60;j++) {
				System.out.println(i+"분 "+j+"초");
				if(i==min && j==sec) {
					//check=1;
					//check=true;
					//check=!check;
					i = 60;
					break;
				}//if ed
			}//in for ed
			//if(check==1){break;}
			//if(check){}
			if(i==min) {
				break;
			}//if ed
		}//out for ed
	}//m ed
}
