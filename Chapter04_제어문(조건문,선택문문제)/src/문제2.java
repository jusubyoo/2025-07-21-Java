// 정수 한개 입력받고 그 수가 3의 배수인지 판단
import java.util.Scanner;
public class 문제2 {
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int num=scan.nextInt();
		
		if(num%3==0)
			System.out.println(num+"은(는) 3의 배수입니다");
		else
			System.out.println(num+"은(는) 3의 배수가 아닙니다");
	}
}
