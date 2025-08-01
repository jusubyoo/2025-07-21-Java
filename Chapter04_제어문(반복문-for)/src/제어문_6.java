/*
 * UpDown 게임
 * => 난수 => 1~100사이
 * => 사용자 입력
 * => 힌트 Up/Down
 * ------------------ 맞출때까지 -> 무한루프
 */
import java.util.Scanner;
/*
 * 반복문을 제어 => 반복제어문
 * 1. 반복문 종료
 *    -> break
 * 2. 특정부분 제어
 *    -> continue
 *    
 * for(int i=1;i<=10;i++)
 * {
 *   if(i==5) break;
 *   System.out.println(i);
 * }
 * => 1 2 3 4
 * 
 * for(int i=1;i<=10;i++)
 * {
 *   if(i==5) continue;
 *   System.out.println(i);
 * }
 * => 1 2 3 4 6 7 8 9 10
 *
 */
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("===== for =====");
//		for(int i=1;i<=10;i++)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println("\n===== break =====");
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5) break;
//			System.out.print(i+" ");
//		}
//		System.out.println("\n===== continue =====");
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5) continue;
//			System.out.print(i+" ");
//		}
		
		Scanner scan=new Scanner(System.in);
		// 1. 컴퓨터에서 난수 발생
		int com=(int)(Math.random()*100)+1;
		int count=0;
		
		for(;;)
		{
			// 2. 사용자 입력값 받기
			System.out.print("1~100 사이의 정수를 입력하시오: ");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
			{
				System.err.print("1~100 사이의 정수를 입력해주세요");
				continue; // 처음으로 돌아간다
				/*
				 *  continue는 for문에서 주로 사용(증가식)
				 *  => 반드시 반복문에서만 사용 가능
				 *  => if, switch에서는 사용 불가능
				 *  
				 *  break는 반복문, switch에서 사용 가능
				 *  => if문은 사용 불가능
				*/
			}
			count++;
			
			if(com>user)
			{
				System.out.println("업");
			}
			else if(com<user)
			{
				System.out.println("다운");	
			}
			else
			{
				System.err.println("정답입니다");
				System.out.println("입력횟수: "+count);
				break;
			}
		}
	}

}
