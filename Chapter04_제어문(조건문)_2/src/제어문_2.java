/*
 *  정수 2개 입력
 *  연산자 입력
 *  + - * / => 사칙연산
 */
import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1=scan.nextInt();
		
		System.out.print("연산자: ");
		String mul=scan.next();
		char op=mul.charAt(0); 
		// Scanner, BufferedReader : char 입력이 없음
		// String => char charAt(0) : 스트링 변환, 첫번째 자리만 잘라옴
		
		System.out.print("두번째 정수: ");
		int num2=scan.nextInt();
		
		System.out.println("===== 입력값 =====");
		System.out.println("첫번째 정수: "+num1);
		System.out.println("연산자: "+op);
		System.out.println("두번째 정수: "+num2);
		
		System.out.println("===== 계산결과 =====");
		if(op=='+')
		{
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1+num2);
		}
		else if(op=='-')
		{
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1-num2);
		}
		else if(op=='*')
		{
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1*num2);
		}
		else if(op=='/')
		{
			if(num2==0)
				System.out.print("0으로 나눌 수 없습니다");
			else
				System.out.printf("%d %c %d = %d\n",num1,op,num2,num1/num2);
		}
		else
		{
			System.out.println("잘못된 연산자를 입력했습니다");
		}
		/*
		 *  if => 조건문
		 *  	  1) 오류 처리
		 *  	  2) 상세보기
		 *  	  3) 검색
		 *  	  4) 게임 (키보드 입력에 따라 처리 변경)
		 *  	  5) 네트워크 : 내부프로토콜
		 *  		 
		 */
	}

}
