/*
 *  점수 입력 => 0~100사이
 *  - 60점 이상이면 합격
 *  - 60점 미만이면 불합격
 */
import java.util.*;
public class 제어문_조건문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		
		int score=scan.nextInt();
		if(score>=60 && score<=100)
			System.out.println(score+"점 합격입니다");
		if(score>=0 && score<60)
			System.out.println(score+"점 불합격입니다");
		if(!(score>=0 && score<=100))
			System.out.println("0~100사이 값을 입력해주세요");
	}

}
