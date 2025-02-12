﻿package a220103;

public class Digit2 {
	public static void main(String[] args) {
		// 음수의 2진 표현
		/*
		 *   8비트
		 *   
		 *   0000 0000  .. 0
		 *   1111 1111  .. 255
		 *   
		 *   양수
		 *   
		 *   
		 *   0 001 1100 >> 28
		 *   
		 *   -28
		 *   
		 *   1 001 1100 부호비트(MSB) 1일 때는 음수, 0일 때는 양수
		 *   
		 *   1 000 0000 >> -0 ?
		 *   
		 *   55 + -55 = 0
		 *   ALU 누산기
		 *   IR 명령 레지스터
		 *   IR의 내의 가산기 >> adder : 덧셈기계
		 *   
		 *   5 + (-2)
		 *   5 * 2 = 5 + 5
		 *   
		 *   5 + (- 5) = 0
		 *   
		 *    0 101
		 *  + 1 101
		 *  -------
		 *    0 101 표현 안되는 건 버려짐
		 *    0 101 = 2[10]
		 *   
		 *    0 101   5
		 *    1 011  -5
		 *  -------
		 *    0 000
		 *    
		 *    1 000 0000 2의 보수법으로 하면 까다로움. but 컴퓨터는 안어려움
		 *    
		 *    
		 *    0 001 1100 >>  28
		 *    0을 1로 변경, +1 해주면 2의 보수
		 *    1 110 0100 >> -28
		 *    
		 *    0 111  7
		 *    1 011 -5
		 *  -------
		 *    0 010  2
		 *    
		 *    0 101  5
		 *    
		 *    10000
		 *     0101
		 *    ----- >>  -5 
		 *    
		 */
		
		System.out.print("0000000000");
		System.out.print("0000000000");
		System.out.print("0000000");
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toBinaryString(-28)); // int 타입은 32비트라서 결과값 저렇게 나옴
		
		// 3 + 5 = 8
		// 연산자 +, =
		// 피연산자 3, 5, 8
		
		
		
	}
}
