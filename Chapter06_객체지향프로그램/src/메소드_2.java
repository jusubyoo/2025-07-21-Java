/*
 *  변수 / 데이터형 / 연산자 / 제어문 ==> 프로그램의 기본
 *  --------------------------
 *  관련된 데이터를 묶는다
 *   - 같은 데이터형 묶으면 '배열'
 *   - 다른 데이터형 묶으면 '클래스'
 *  관련된 명령문을 묶으면 '메소드'
 *   => 만들지 못하는 부분 존재 => 제공하는게 API
 *  ------------------------------------- 묶어서 처리 => 객체
 *  
 *  
*/
// 리턴형 받기 => 기본형 / 배열 / 클래스(상세보기)
// 사칙연산
import java.util.Scanner;
public class 메소드_2 {
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg);
		return scan.nextInt();
	}
	static int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static String div(int a, int b) {
		// void 사용 => 자체 출력
		if(b==0)
			return "0으로 나눌 수 없다";
		else
			return String.valueOf(a/(double)b);
		// String 클래스명이 붙으므로 static
	}
	// 계산기
	static void process()
	{
		int a=input("첫번째 정수 입력: ");
		int b=input("두번째 정수 입력: ");
		Scanner scan=new Scanner(System.in);
		System.out.print("연산자를 입력(+,-,*,/): ");
		switch(scan.next())
		{
		case "+" -> {
			int c=plus(a,b);
			System.out.printf("%d + %d = %d\n",a,b,c);
		}
		case "-" -> {
			int c=minus(a,b);
			System.out.printf("%d - %d = %d\n",a,b,c);
		}
		case "*" -> {
			int c=mul(a,b);
			System.out.printf("%d * %d = %d\n",a,b,c);
		}
		case "/" -> {
			System.out.println(div(a,b));
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
}
