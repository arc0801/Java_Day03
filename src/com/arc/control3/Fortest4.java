package com.arc.control3;

import java.util.Scanner;

public class Fortest4 {

	public static void main(String[] args) {
		//1부터 100사이의 수를 입력
		//0부터 입력한 수까지의 합을 계산하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~100 사이의 수를 입력해주세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num>=1 && num<=100) {
		
			for(int i=0;i<=num;i++) {
				sum = sum +i;
			}
		
			System.out.println(sum);
		}else {
			System.out.println("1~100 사이의 수를 입력해주세요.");
		}
		
	}//m ed
}
