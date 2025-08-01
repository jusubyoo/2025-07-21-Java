// 100점 만점으로 성적을 입력 받아 
// 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라 (switch~case 사용)
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int score=scan.nextInt();
		
		if(score>=0 && score<=100)
		{
			switch(score/10)
			{
			case 10,9 -> {
				System.out.print("A학점입니다");
			}
			case 8 -> {
				System.out.print("B학점입니다");
			}
			case 7 -> {
				System.out.print("C학점입니다");
			}
			case 6 -> {
				System.out.print("D학점입니다");
			}
			default -> {
				System.out.print("F학점입니다");
			}
			}
		}
		else
		{
			System.err.println("0부터 100 사이의 정수를 입력해주세요");
		}
	}
}
	
