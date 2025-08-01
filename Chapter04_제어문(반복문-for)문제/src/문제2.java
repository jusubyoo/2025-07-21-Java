// 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 
// 프로그램을 만들어라 (switch~case 사용) 
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		System.out.print("+,-,*,/ 입력:");
		String mul=scan.next();
		System.out.print("정수 입력:");
		int b=scan.nextInt();
		
		switch(mul)
		{
		case "+" -> {
			System.out.printf("%d %s %d = %d\n", a,mul,b,a+b);
		}
		case "-" -> {
			System.out.printf("%d %s %d = %d\n", a,mul,b,a-b);
		}
		case "*" -> {
			System.out.printf("%d %s %d = %d\n", a,mul,b,a*b);
		}
		case "/" -> {
			if(b==0)
			{
				System.err.println("0으로 나눌 수 없습니다");
			}
			else
			{
				System.out.printf("%d %s %d = %d\n", a,mul,b,a/b);
			}
		}
		}
	}

}
