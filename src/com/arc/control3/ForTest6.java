package com.arc.control3;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		//로그인, id pw
		
		Scanner sc=new Scanner(System.in);
		
		int id=1234; //회원가입시 id
		int pw=5678; //회원가입시 pw
		int yId = 0;
		int yPw = 0;

		//로그인과정 최대 5번
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("ID를 입력하세요.");
			yId=sc.nextInt();
			System.out.println("PW를 입력하세요.");
			yPw=sc.nextInt();
			
			//로그인이 성공했다면
			//은행업무 시작 출력
			
			if(yId==id && yPw==pw) {
					System.out.println("은행업무 시작");
					break; //i=6;
			}
				
		}
		
		System.out.println("프로그램 종료");
		
	}//m ed
}
