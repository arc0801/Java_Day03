package com.arc.control5;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		//로그인
		/**
		 * while
		 * 로그인 검증
		 * 실패시 종료
		 */
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = true;
		int result = 0;

		while(check) {
			System.out.println("1. 로그인하시겠습니까?");
			System.out.println("2. 종료하시겠습니까?");
			int num = sc.nextInt();

			if(num==1) {
				System.out.println("ID를 입력하세요");
				int yId = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int yPw = sc.nextInt();

				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					result = 1;
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				System.out.println("프로그램 종료");
				break;
			}//if
		}//while

		///////////////////////////
		//로그인이 성공했을 때 실행
		//게임 실행 - RPG - 
		//시작 레벨 : 1
		//만렙 	: 15
		//모든 몬스터의 경험치는 동일
		// 1 -> 2	: 3마리
		// 2 -> 3	: 6마리
		// 3 -> 4	: 9마리
		// 4 -> 5	: 12마리
		//.......
		// 14 -> 15 : 42마리
		// 마릿수 출력 / 레벨업 출력
		// 5렙 달성시 : 1000 골드 지급
		// 10렙 달성시 : 2000 골드 지급
		// 15렙 달성시 : 3000 골드 지급
		// 만렙 달성 골드는 6천골드 있습니당
		//** 추가
		//렙업시 계속 사냥할거냐? 종료할거냐?

		int a = 0;
		int sum = 0;
		
		if(result==1) {
			System.out.println("Game Start!");

			
				for(int i=1;i<15;i++) {
					for(int j=1;j<43;j++) {
						System.out.println(j+"마리 사냥 성공");
						if(j==i*3) {
							System.out.println(i+1+" Level Up!!!");
							
							if(i==4) {
								a = 1000;
								sum = 0+a;
								System.out.println(a+" gold 지급");
							}else if(i==9) {
								a = 2000;
								sum = sum+a;
								System.out.println(a+" gold 지급");
							}else if(i==14) {
								a = 3000;
								sum = sum+a;
								System.out.println(a+" gold 지급");
								
								System.out.println("만렙 달성");
								
								System.out.println(sum+" gold 소지중");
							}
							
							System.out.println("1. 사냥을 계속 하시겠습니까?");
							System.out.println("2. 사냥을 그만 하시겠습니까?");
							int num2 = sc.nextInt();
							
								if(num2==2) {
									j=43;
									i=15;
								}
							
							break;
						}//if
						
					}//for
					
					
				}//for
				 
				System.out.println("게임 종료");

			}//if

		}//main
	}
