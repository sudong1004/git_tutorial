package _if;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("첫번째 입력 : ");
	int a = scn.nextInt();
	System.out.print("두번째 입력 : ");
	int b = scn.nextInt();
	System.out.print("세번째 입력 : ");
	int c = scn.nextInt();
	
	if(a < b && a < c){
		if( b < c) { 
			System.out.println(a + ", " + b + ", " + c);
		}else {
			System.out.println(a + ", " + c + ", " + b);
		}
	}else if(b < c) {
		if(a < c) System.out.println(b + ", " + a + ", " + c);
		else System.out.println(b + ", " + c + ", " + a);
	}else {
		if( a < b) System.out.println(c + ", " + a + ", " + b);
		else System.out.println(c + ", " + b + ", " + a);
		}
	}
}

/*
[문제] if문 사용 
3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오
3개의 숫자를 모두 다르게 입력한다.

[실행결과]
첫번째 입력 : 85
두번째 입력 : 80
세번째 입력 : 65
65  80  85

첫번째 입력 : 62
두번째 입력 : 60
세번째 입력 : 80
60  62  80
*/
