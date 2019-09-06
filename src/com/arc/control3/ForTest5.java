package com.arc.control3;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		
		//0~60 미만의 초를 입력
		Scanner sc= new Scanner(System.in);
		
		System.out.println("초를 입력해주세요.");
		int time = sc.nextInt();
		
			for(int sec=0;sec<60;sec++) {
				System.out.println(sec+" 초");
				
				if(time==sec) {
					break; //sec=60;//59부터 가능
				}
				
			}
			
		
		
	}//m ed
}
