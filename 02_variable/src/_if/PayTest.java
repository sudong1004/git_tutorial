package _if;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayTest {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat();
	
	System.out.print("이름 입력 : ");
	String name = scn.next();
	System.out.print("직급 입력 : ");
	String position = scn.next();
	System.out.print("기본급 입력 : ");
	int basePay = scn.nextInt();
	System.out.print("수당 입력 : ");
	int extraPay = scn.nextInt();
	System.out.println();
	
	int totalPay = basePay + extraPay;
	double taxRate;
	if(totalPay >= 4000000) {
		taxRate = 0.03;
	}else taxRate = 0.02;
	
	int tax = (int)(totalPay * taxRate);
	int pay = totalPay - tax;
	
	System.out.println("\t\t *** " + name + " 월급 명세서 *** ");
	System.out.println("직급 : " + position);
	System.out.println();
	System.out.println("기본급\t\t수당\t\t급여\t\t세율\t\t세금\t월급");
	System.out.println();
	System.out.println(df.format(basePay) + "\t"
					+ df.format(extraPay) + "\t" 
					+ df.format(totalPay) + "\t"
					+ df.format((int)taxRate*100) + "%\t"
					+ df.format(tax) + "\t"
					+ df.format(pay));
	}

}

/*
[문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000원 이상이면 3% 아니면 2%로 한다 
if문 또는 조건 연산자 사용해도 된다.

급여 = 기본급 + 수당
세금 = 급여 * 세율
월급 = 급여 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4500000
수당 입력 : 200000

         *** 홍길동 월급 명세서 ***
직급 : 부장

기본급      수당         급여            세율      세금      월급
4,500,000     200,000     4,700,000      3%      xx,xxx   x,xxx,xxx
*/
