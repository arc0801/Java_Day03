package com.arc.control4;

public class ForTest4 {

	public static void main(String[] args) {
		//break
		
		int num=3;
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				
				System.out.println(i+" : "+j);
				if(j==num) {
					break; //다중반복문에서 break를 만나면 가장 가까운 반복문에서만 벗어남.
				}
			}//안쪽 for 끝
			
		}//바깥쪽 for 끝
		
		
		System.out.println("프로그램 종료");
		
		
	}
}
