package variable;

import java.util.Scanner;

public class SungJuk {

	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	System.out.print("이름 입력 : ");
	String name = scn.next();
	
	System.out.print("국어 입력 : ");
	int kor = scn.nextInt();
	System.out.print("영어 입력 : ");
	int eng = scn.nextInt();
	System.out.print("수학 입력 : ");
	int math = scn.nextInt();
	
	int tot = kor + eng + math;
	double avg = tot / 3;
	
	System.out.println("\t*** 홍길동의 성적표 ***\t");
	System.out.println("국어	영어	수학	총점	평균");
	System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.3f",avg));
		
	}

}

/*
[문제] 이름(name), 국어(kor), 영어(eng), 수학(math)을 입력하여 총점(tot)과 평균(avg)을 계산하시오.
 
 총점 = 국어 + 영어 + 수학
 평균 = 총점 / 과목수
 평균은 소수이하 3째자리까지나온다.
 Scanner 사용(nextInt(), nextDouble(),next())
 
 [실행결과]
 이름 입력 : 홍길동(String)
 국어 입력 : 95
 영어 입력 : 100
 수학 입력 : 71
 
 		*** 홍길동의 성적표 ***
 국어 	영어	 수학	총점	평균
 95		100		 73		xxx		xx.xxx
 */
