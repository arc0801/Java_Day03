package com.arc.control3;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//학생의 인원수 입력
		//각 학생의 나이를 입력
		//평균 나이 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수를 입력해주세요");
		int num = sc.nextInt();
		
		
		int sum = 0;
		int age = 0;
		for(int i=1;i<=num;i++) {
			System.out.println("각 학생의 나이를 입력해주세요");
			age = sc.nextInt();
			sum = sum + age; //@@@누적함수@@@
			}
		
		System.out.println(sum/num);
		
		
	}//m ed
}
