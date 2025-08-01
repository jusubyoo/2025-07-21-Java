import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int start=0;
		int end=0;
		int gop=1;
		
		for(;;)
		{
			System.out.print("첫번째 정수 입력: ");
			start=scan.nextInt();
			System.out.print("두번째 정수 입력: ");
			end=scan.nextInt();
			if(start<=end)
			{
				break;
			}
		}
		for(int i=start;i<=end;i++)
		{
			gop*=i;
		}
		System.out.println("===== 결과 =====");
		System.out.println(start+"에서 "+end+"까지의 곱: "+gop);
	}

}
