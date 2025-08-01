// 정수를 입력받아 양수인지 음수인지 확인
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int num=scan.nextInt();
		
		if(num>-1)
		{
			System.out.println(num+"은(는) 양수입니다");
			System.out.println("절대값: "+Math.abs(num));
		}
		else
		{
			System.out.println(num+"은(는) 음수입니다");
			System.out.println("절대값: "+Math.abs(num));
		}
		

	}

}
