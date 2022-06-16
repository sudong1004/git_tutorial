package variable;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) throws IOException {
		System.out.print("데이터를 입력 : ");
		int data = System.in.read(); // 1개 문자 입력받음
		System.out.println(data);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = scn.nextInt();
		System.out.print("실수 입력 : ");
		double b = scn.nextDouble();
		
		System.out.println(a + " + " + b + "=" + (a + b));
	}

}

/*
Exception(예외처리)
- 생각지도 않은 에러 발생
- 예) 자동차보험
 */
