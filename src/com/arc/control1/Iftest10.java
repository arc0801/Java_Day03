package com.arc.control1;

import java.util.Scanner;

public class Iftest10 {

	public static void main(String[] args) {
		//게임 
		//로그인
		//캐릭터
		int id = 1234; //회원가입시 ID
		int pw = 5678; //회원가입시 PW
		
		
		
		//로그인 진행 코드
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요.");
		int yId = sc.nextInt();
		System.out.println("PW를 입력하세요.");
		int yPw = sc.nextInt();
		
		int result = 0;
		//boolean check = false;
		
		if(yId==id && yPw==pw) {
			result=1;
			//check = true;
			//check = !check;
			System.out.println("캐릭터를 선택하세요.");
		}else {
			System.out.println("로그인에 실패했습니다.");
		}
		
				
		//캐릭터 선택
		//마법사, 궁수, 전사, 다음에 선택
		
		if(result==1) {
			//if(check)
			System.out.println("1. 마법사");
			System.out.println("2. 궁수");
			System.out.println("3. 전사");
			System.out.println("4. 다음에 선택");
		
			int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("마법사 선택");
			}else if(ch==2) {
				System.out.println("궁수 선택");
			}else if(ch==3) {
				System.out.println("전사 선택");
			}else {
				System.out.println("다음에 선택");
			}
			
			System.out.println("캐릭터 : "+ch);

			
		}
		
				
		
		
	}//main end
}
