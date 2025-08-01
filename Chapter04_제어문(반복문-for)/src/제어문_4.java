/*
 *  for => 형식, 동작순서
 *  	   -----------
 *  	   for(초기값;조건식;증가식)
 *  	   {
 *  	     실행문장 (반복)
 *  	   }
 *  
 *  정수 입력 => 2~9
 *  => 구구단
 *  2*1=2
 *  ...
 *  9*9=81
 */
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~9 사이의 정수를 입력하시오: ");
		int a=scan.nextInt();
		System.out.print("1~9 사이의 정수를 입력하시오: ");
		int b=scan.nextInt();

		if((a>=1 && a<=9) && (b>=1 && b<=9))
		{
			for(int i=1;i<=9;i++)
			{
				for(int j=1;j<=9;j++)
				System.out.printf("%d * %d= %d\n",a,b,a*b);
			}
		}
		else
		{
			System.err.println("구구단 출력이 불가능합니다");
		}
	}

}
