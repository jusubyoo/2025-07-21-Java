/*
 *  숫자 야구게임
 *  
 *  난수 => 3 6 9
 *  ------------
 *   4 5 6 => 1B
 *   3 7 9 => 2S
 *  ------------ 3S가 나오면 종료
 *  
 *  => 저장을 배열로 만든다
*/
import java.util.Arrays;
import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터가 난수 발생(중복x) => 1~9 세자리수 111~999
		int[] com = new int[3];
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) // 중복된 값 확인
				{
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com));
		// -------------
	
		// 2. 사용자 입력
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		while(true) // 횟수가 지정이 안된 경우 => 반드시 종료 조건을 줘야된다
		{
			System.out.print("✨세자리 정수를 입력: ");
			int input=scan.nextInt();
			
			if(input<100 || input>999) {
				System.err.println("⚠️ 세자리 정수를 입력해야 됩니다 ⚠️");
				continue; // 처음으로 다시 돌아간다
			}
			
			// 정상적으로 세자리 정수 입력 완료
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] ||
			   user[0]==user[2] ||
			   user[1]==user[2])
			{
				System.out.println("✔️ 중복된 수는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("✔️ 0은 사용할 수 없습니다");
				continue;
			}
			
			int s=0, b=0;
			for(int i=0;i<3;i++) // com 
			{
				for(int j=0;j<3;j++) // user 
				{
					if(com[i]==user[j]) // 같은 수가 있는지
					{
						if(i==j) // 같은 자리에 있는 경우
							s++;
						else
							b++;
					}
				}
			}
			// 힌트
			System.out.printf("💩 input Number:%d,Result:%dS-%dB\n",
					input,s,b);
			// 종료
			if(s==3) {
				System.out.println("👍 축하합니다 👍");
				break; // while 문 종료
			}
		}
		// 3. 힌트
		// 4. 종료여부 확인
		// ------------- 반복문
		
	}

}
