package variable;

public class VariableTest {

	public static void main(String[] args) {
		//자료형 변수명;
		boolean  a = 25 > 36; // 1byte = 8bit
		char b = 'A'; // 2byte = 16bit 0000 0000 0100 0001
		int c = 65; // 4byte = 32bit 0000 0000 0000 0000 0100 0001
		double d = 25.8;
		
		char e = 65;
		int f = 'A';
		
		float g = 43.6f;
		
		long h = 25; // 25는 int형 상수
		long i = 25L; // 25L은 long형 상수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e); //A 
		System.out.println(f); //65
		System.out.println(g);
	}

}


/*
상수
정수형 - 25, 36, -15 (int)
실수형 - 25.8, 45.6, -15.2 (double)

float g = 43.6; //error
double g = 43.6;
float g = 43.6f; // 43.6F (float형 상수)
*/