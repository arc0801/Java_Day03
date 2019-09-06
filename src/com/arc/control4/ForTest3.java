package com.arc.control4;

public class ForTest3 {

	public static void main(String[] args) {
		// *찍기
		/*
		 * 		*****
		 * 		*****
		 * 		*****
		 * 		*****
		 * 		***** 
		 */
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		***** 
		 */
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 		***** 
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}//m ed
}
