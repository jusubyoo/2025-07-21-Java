import java.util.Scanner;
public class 제어문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		
		do
		{
			System.out.print("1~100사이의 정수를 입력하시오: ");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.err.println("잘못된 입력입니다");
				continue;
			}
			
			if(com>user)
			{
				System.out.println("👆");
			}
			else if(com<user)
			{
				System.out.println("👇");
			}
			else
			{
				System.out.println("정답입니다");
				break;
			}
		} while(true);
	}

}
