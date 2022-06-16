package variable;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("현금 입력 : ");
		int cash = scn.nextInt();
		
		DecimalFormat df = new DecimalFormat();
		int thus = cash / 1000;
		int hun = (cash - (thus * 1000)) / 100;
		int ten = ((cash - (thus * 1000 + hun * 100)) /10);
		int one = cash % 10 ;
		System.out.println("현금 " + df.format(cash) + "원");
		System.out.println("천의 자리 : " + thus + "장");
		System.out.println("백의 자리 : " + hun + "개");
		System.out.println("십의 자리 : " + ten + "개");
		System.out.println("일의 자리 : " + one + "개");
		
	}

}

/*
[문제] 현금을 입력하여 천의자리, 백의자리, 십의자리, 일의자리를 각각 뽑아주시오

[실행결과]
현금 입력 : 1234

현금 1,234원
천의 자리 : 1장
백의 자리 : 2개
십의 자리 : 3개
일의 자리 : 4개
 */