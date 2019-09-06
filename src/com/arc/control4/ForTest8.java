package com.arc.control4;

public class ForTest8 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			//짝수
			if(i%2==1) {
				continue;
			}
			
			System.out.println(i);
			
			
		}//for
		
	}//main
}
