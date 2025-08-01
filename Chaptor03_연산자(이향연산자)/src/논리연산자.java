/*
 * 	(조건) && (조건) (조건) || (조건)
 * 
 * 	&& => 범위나 기간 포함
 * 		  0 <= && <= 100
 * 	|| => 범위나 기간 벗어남 => 오류처리(잘못된 입력)
 * 		  0 >= || >= 100 (오류)
 *	-----------------------------------------
 *	경우의 수
 * 	------------------------------------
 * 	(조건) (조건)		&&(직렬)		||(병렬)
 * -------------------------------------
 * 	true  true		 true		 true
 * -------------------------------------
 *	true  false 	 false		 true
 * -------------------------------------
 *  false true		 false		 true
 * -------------------------------------
 *  false false		 false		 false
 * -------------------------------------
 * 	효율적인 조건 검색 => 속도 최적화
 * 	=> 앞에 있는 조건이 true ==> ||은 뒤에 있는 조건은 수행하지 않음
 * 	=> 앞에 있는 조건이 false ==> &&는 뒤에 있는 조건을 수행하지 않음
 * 
 * 	=> a ~ b => &&
 * 	=> 오류 처리 => ||
 * 	1. 프로그램은 반드시 시작과 동시에 오류처리
 * 	   ex) 문자열을 받아서 좌우 대칭 여부를 확인하는 프로그램
 * 		   ABBA => 0, length-1
 *  2. 범위 안에 설정 
*/
import java.util.Scanner;
// 알파벳 한개 입력 => 대문자/소문자 
/*
 * 	c
 *  대문자 조건
 *   => c>='A' && c<='Z'
 *  소문자 조건
 *   => c>='a' && c<='z'
 *   
 *  => && > || => &&연산자가 ||연산자보다 우선순위가 높음
 *  
 *  => 윤년 여부
 *     - 4년에 한 번
 *     - 100년마다 제외
 *     - 400년마다 한 번
*/
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("알파벳 한개 입력:");
//		String str=scan.next();
//		char c=str.charAt(0);
//		// 첫번째 문자 가져오기
//		System.out.println(c);
//		if(c>='A' && c<='Z')
//			System.out.println("대문자입니다");
//		else if(c>='a' && c<='z')
//			System.out.println("소문자입니다");
//		else
//			System.out.println("알파벳이 아닙니다");
		
		// 효율적인 연산
		// && => (조건)&&(조건)
		
//		int x=10;
//		int y=9;
//		boolean result=(x<y) || ++y==x;
//		System.out.println("result:"+result);
//		System.out.println("x="+x);
//		System.out.println("y="+y);
		// &&는 앞에 문장이 false면 뒤에 문장 수행 안함
		// ||는 앞에 문장이 true면 뒤에 문장 수행 안함
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		String result=(year%4==0 && year%100!=0) 
				|| (year%400==0)?"윤년입니다":"윤년이 아닙니다";
		System.out.println(result);
		
		
	}

}
