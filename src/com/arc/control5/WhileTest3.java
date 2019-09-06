package com.arc.control5;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//로그인 검증
		int id = 1234;
		int pw = 5678;
		boolean check = true;
		
		while(check) {
			System.out.println("1. 로그인하시겠습니까?");
			System.out.println("2. 종료하시겠습니까?");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.println("ID를 입력하세요.");
				int yId = sc.nextInt();
				System.out.println("PW를 입력하세요.");
				int yPw = sc.nextInt();
				
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
				
			}else{
				break;
			}//if
			
		}//while
		
		System.out.println("프로그램 종료");
		
	}//main
}
