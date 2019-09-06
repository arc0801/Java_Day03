package com.arc.control1;

import java.util.Scanner;

public class Iftest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Sysout/sout  (ctrl +space)
		System.out.println("숫자를 입력하세요(1~3)");
		
		int select = sc.nextInt();
		
		if(select == 1){
			System.out.println("1번 선택");
		}else if(select == 2) {
			System.out.println("2번 선택");
		}else if(select == 3) {
			System.out.println("3번 선택");
		}else {
			System.out.println("그 외 나머지 숫자들..");
		}
		
		
		
		
		
	}
}
