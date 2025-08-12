import java.util.Scanner;
public class 메소드_1_변환2 {
	// 난수
	/*
	 *   사용자 입력
	 *   비교
	 *   종료
	 */
	static int[] com=new int[3];
	static int[] user=new int[3];
	static int s,b; // strike, ball
	
	// 전역변수 => 프로그램 종료시까찌 유지
	// 리턴형, 매개변수를 신경쓰지 않아도 된다
	static void rand() {
		// 지역변수 -> 자동 삭제
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				// j는 이미 저장
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
	}
	
	static void userInput()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력: ");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("※ 잘못된 입력입니다 ※");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("※ 중복된 수는 사용할 수 없습니다 ※");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("※ 0은 사용할 수 없습니다 ※");
				continue;
			}
			break; // break가 없으면 무한루프
		}
	}
	
	static void compare()
	{
		s=0;
		b=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		// 힌트
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	
	static boolean isEnd() {
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	static void process() {
		rand();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			userInput();
			compare();
			if(isEnd())
			{
				System.out.println("축하합니다");
				System.out.print("게임을 다시 할까요?(y/Y):");
				char c=scan.next().charAt(0);
				if(c=='y' || c=='Y')
				{
					System.out.println("새 게임을 시작합니다");
					process(); // 재귀호출 -> 자신의 메소드를 호출
				}
				else
				{
					System.out.println("Game Over");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
