﻿package a220103;

public class Digit {
	public static void main(String[] args) {
		/*
		 * 10진수를 n진수로 변환
		 * 
		 * 13[10]
		 * 
		 * 		13 2 .. 1
		 * 		 6 2 .. 0
		 * 		 3 2 .. 1
		 * 		 1 2 .. 1	
		 * 		 0
		 * 
		 * = 1101[2]
		 * 
		 * 		13 8 .. 5
		 * 		 1 8 .. 1
		 * 		
		 * = 15[8]
		 * 
		 * n진수를 10진수로 변환
		 * 
		 * 111011[2]
		 * 
		 * 32+16+8+2+1 = 59
		 * 
		 * 실수의 진법 변환
		 * 23.75[10]
		 * = 20 + 3 + 0.7 + 0.05
		 * = 2 * 10 + 3 * 1 + 7 * 0.1 + 5 * 0.01
		 * = 2 * 10^1 + 3 * 10^0 + 7 * 10^-1 + 5 * 10^-2
		 * 
		 * = 10111.11[2]
		 * 
		 * 		0.75
		 * 		   2
		 * 		0.5  .. 1
		 * 		   2
		 * 		0.0  .. 1
		 * 
		 * = 10111.11[2]
		 * 
		 * 정수부 : 2^4 + 2^2 + 2^1 + 2^0
		 * 실수부 : 2^-1 + 2^-2
		 * 
		 * 0.1
		 * 
		 * 		0.1
		 * 		  2
		 * 		0.2 .. 0
		 * 		  2
		 * 		0.4 .. 0
		 * 		  2
		 * 		0.8 .. 0
		 * 		  2
		 * 		0.6 .. 1
		 * 		  2
		 * 		0.2 .. 1
		 * 
		 */
		
		double d = 0.14;
		System.out.println(d);
		System.out.println(d+1); // 실수의 진법 변환에서 오차가 발생하기 때문. p.68 변수 쓰면 대체로 참조변수
		
		
	}
}
