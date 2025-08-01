// 조건문 
/*
 *  선택 조건문 : true/false 나눠서 작업
 *  변수 / 연산자 / 제어문 / 메소드
 *  -------------------------- 웹에서 사용
 *  
 *  정수를 입력 받아서
 *  11 22 33 ... => 십의 자리와 일의 자리가 같은 수 인지 다른 수인지
 */
import java.util.Scanner;
public class 제어문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
				
		if(num>=10 && num<=99)
		{
			if(num%11==0)
				System.out.println(num+"는(은) 같은 숫자입니다");
			else
				System.out.println(num+"는(은) 다른 숫자입니다");
		}
		else
			System.out.println("두 자리의 정수가 아닙니다");
	}

}
