package com.arc.control3;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//단수를 입력..
		// 3*1=3
		// 3*2=6
		// 3*3=9
		// ....
		// 3*9=27
		
		System.out.println("단 수를 입력하세요");
		int num=sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
		
		
		
		System.out.println("===========");
		//1부터 100사이의 숫자 중에서 홀수만 출력
		
		for(int i=1;i<101;i++) {
			//System.out.println(i);
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		System.out.println("===========");
		//0부터 9까지의 합을 계산.
		//누적함수
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
		
		
		System.out.println("===========");
		//int i=0;
		for(int i=0;i<10;i++) {
			System.out.println("문구");
			System.out.println(i);
		}
		
		//System.out.println(i); //10
		
		
	}//m ed
	
}
