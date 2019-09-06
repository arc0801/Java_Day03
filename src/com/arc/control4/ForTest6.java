package com.arc.control4;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//FPS - 서든, 배그
		for(int tan=0;tan<3;tan++) {
			System.out.println("1. 단발");
			System.out.println("2. 점사");
			int mode = sc.nextInt();
			String a = "";
			int b=0;
		
			if(mode==1) {
				a="탕";
				b=1;
			}else if(mode==2) {
				a="타타탕";
				b=3;
			}//if
			
			for(int i=0;i<30;i=i+b) {
				System.out.println(a);
			}//in for
			
		}//out for
	}//m ed
}
