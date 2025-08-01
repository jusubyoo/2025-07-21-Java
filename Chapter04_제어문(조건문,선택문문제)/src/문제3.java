// 1~4학년 시험
// 4학년은 70점 이상 합격
// 1~3학년은 60점 이상 합격
// 점수가 0미만, 100초과면 경고문구 출력
import java.util.Scanner;
public class 문제3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("학년을 입럭하시오: ");
		int grade=scan.nextInt();
		
		System.out.print("점수를 입력하시오: ");
		int score=scan.nextInt();
		
		if(score<0 || score>100)
		{
			System.out.println("0~100점 사이의 점수를 입력해주세요");
		}
		else
		{
			System.out.println(
				(grade!=4 && score>=60)||(grade==4 && score>=70)?"합격":"불합격"
			);
			
//			if(grade>=1 && grade<=3)
//			{
//				if(score>=60)
//					System.out.println(grade+"학년 "+score+"점으로 합격입니다");
//				else
//					System.out.println(grade+"학년 "+score+"점으로 불합격입니다");
//			}
//			else
//			{
//				if(score>=70)
//					System.out.println(grade+"학년 "+score+"점으로 합격입니다");
//				else
//					System.out.println(grade+"학년 "+score+"점으로 불합격입니다");
//			}
			
		}
		
	}
}
