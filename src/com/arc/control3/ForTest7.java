package com.arc.control3;

import java.util.Scanner;

public class ForTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select = 3;
		
		for(int i=0;i<10;i++) {
			
			/*
			if(i==select) {
				System.out.println("Exit");
				break;
			}
			*/
			
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			select = sc.nextInt();
			
			switch(select) {
				case 1:
					System.out.println("입금 코드를 작성하세요");
					break;
				case 2:
					System.out.println("출금 코드를 작성하세요");
					break;
				default:
					System.out.println("안녕히 가세요");
					i=10;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}//m ed
}
