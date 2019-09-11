package com.arc.control5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean check1 = true;
		boolean check2 = true;
		int sum = 0;
		int price = 0;
		String menu = "";
		int num = 0;
		int select = 0;
		
		while(check1) {
		while(check2) {
			System.out.println("==메뉴를 선택하세요==");
			System.out.println("--햄버거");
			System.out.println("1. 와퍼 : 6000원");
			System.out.println("2. 몬스터와퍼 : 8000원");
			System.out.println("3. 치킨버거 : 4000원");
			System.out.println("--사이드");
			System.out.println("4. 감자튀김 : 2000원");
			System.out.println("5. 치킨너겟 : 3000원");
			System.out.println("6. 치즈스틱 : 1000원");
			System.out.println("--음료");
			System.out.println("7. 콜라 : 1500원");
			System.out.println("8. 커피 : 1000원");
			System.out.println("=================");

			System.out.println("메뉴를 선택하세요");
			select = sc.nextInt();
			System.out.println("수량을 선택하세요");
			num = sc.nextInt();
			
			if(select==1) {
				menu = "와퍼";
				price = 6000;
			}else if(select==2){
				menu = "몬스터와퍼";
				price = 8000;
			}else if(select==3){
				menu = "치킨버거";
				price = 4000;
			}else if(select==4){
				menu = "감자튀김";
				price = 2000;
			}else if(select==5){
				menu = "치킨너겟";
				price = 3000;
			}else if(select==6){
				menu = "치즈스틱";
				price = 1000;
			}else if(select==7){
				menu = "콜라";
				price = 1500;
			}else if(select==8){
				menu = "커피";
				price = 1000;
			}else {
			}
			
			sum = sum + num*price;
			
			System.out.println("1. 추가 주문하시겠습니까?");
			System.out.println("2. 주문을 끝내겠습니다.");
			int add = sc.nextInt();
			
			if(add == 2) {
				System.out.println("*주문내역*");
				System.out.println(menu+" : "+num+"개 - "+num*price+"원");
				check2 = false;
			}//if
			
			
		}//while2

		System.out.println("총 금액 : "+sum+"원");
		
		
		}//while1
	}//main
}
