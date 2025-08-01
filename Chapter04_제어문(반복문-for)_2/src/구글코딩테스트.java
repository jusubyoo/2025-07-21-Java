// 문자열을 입력받아서 => 문자 좌우대칭 여부 확인
// 모든 문자열은 짝수
import java.util.Scanner;
public class 구글코딩테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String msg="";
		// 오류 처리
		for(;;)
		{
			System.out.print("문자열 입력(짝수):");
			msg=scan.next();
			if(msg.length()%2==0)
			{
				break;
			}
		}
		
		boolean bCheck=true;
		
		for(int i=0;i<msg.length()/2;i++)
		{
			if(msg.charAt(i)!=msg.charAt(msg.length()-i-1))
			{
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
		{
			System.out.println(msg+"은(는) 좌우 대칭이다");
		}
		else
		{
			System.out.println(msg+"은(는) 좌우 대칭이 아니다");
		}
	}

}
