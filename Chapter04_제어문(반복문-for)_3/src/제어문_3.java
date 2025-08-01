import java.util.Scanner;
/*
 *  com 0 
 *    user 0
 *    user 1
 *    user 2
 *  com 1
 *    user 0
 *    user 1
 *    user 2
 *  com 2
 *    user 0
 *    user 1
 *    user 2
 */
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		
		for(int i=1;i<=10;i++)
		{
			// 1. computer => 난수발생
			int com=(int)(Math.random()*3);
			// 가위(0),바위(1),보(2)
			// 2. 사용자 입력
			System.out.print("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			
			if(user<0 || user>2)
			{
				System.err.println("가위바위보를 입력해야 됩니다");
				i--;
				continue; // i++
			}
			
			// 정상 입력이 된 상태
			int res=com-user;
			if(res==-2 || res==1)
			{
				lose++;
				System.out.println("컴퓨터 Win");
			}
			else if(res==2 || res==-1)
			{
				win++;
				System.out.println("플레이어 Win");
			}
			else
			{
				same++;
				System.out.println("Draw");
			}
			
			// 3. 승, 패, 무 
		}
		System.out.println("===== 결과값 =====");
		System.out.printf("%d전 %d승 %d무 %d패",(win+same+lose),win,same,lose);
	}

}
