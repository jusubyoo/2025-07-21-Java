/*
 *  1. 12월, 1월, 2월   => 겨울
 *  	3월, 4월, 5월   => 봄
 *  	6월, 7월, 8월   => 여름
 *  	9월, 10월, 11월 => 가을
 *  1) 사용자 입력을 받는다 (월입력)
 *  2) 결과값은 봄, 여름, 가을, 겨울 중 하나를 출력
 */
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("달을 입력하시오: ");
		int a=scan.nextInt();
		
		if(a>=3 && a<=5)
			System.out.print(a+"월은 봄입니다");
		if(a>=6 && a<=8)
			System.out.print(a+"월은 여름입니다");
		if(a>=9 && a<=11)
			System.out.print(a+"월은 가을입니다");
		if(a==1 || a==2 || a==12)
			System.out.print(a+"월은 겨울입니다");
	}

}
