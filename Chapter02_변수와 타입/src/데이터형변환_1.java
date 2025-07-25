/*
 * 	형변환
 * 	 = 자동형변환
 * 	   큰데이터형 = 작은데이터형;
 * 		  | 		  |
 * 		  -------------
 * 				|
 * 			 자동형변환
 * 		int a = 'A'; ==> 'A' 자동으로 65로 변경해서 저장
 * 		---		---
 * 		 4       2
 * 		
 * 		long a=100; => 100(int)을 long형(100L)으로 변경후에 저장
 * 		----   ---
 * 		  8		4(int) ==> 100L
 * 
 * 		double d = 'A' ==> 'A'를 double로 변경후에 저장
 * 						   ---
 * 							65.0
 * 		--------------------------------------------
 * 		 데이터형 = 같은 데이터형;
 * 		 -------------------
 * 		 int a=100
 * 		 char c='A' => 왼쪽이 크거나 같아야 함
 * 		 			   작은 데이터가 들어오면 자동으로 데이터형이 변경됨
 * 		 작은 데이터형 = 큰 데이터형;
 * 		 int a=10.5
 * 			   ---- double => error 발생
 * 			   ---- 자동으로 변경 불가능
 * 			   ---- 강제로 변경해야됨(데이터형)
 * 					ex) (int), (double), (char),...
 * 		 => int a=(int)10.5; => a=10
 * 		 => char c=(char)65.0; => c='A'
 * 		 => 예외 
 * 			  char c=65 => 가능
 * 					 -- 'A'로 변환후에 저장
 * 		 => byte b=(byte)170; => 불가능 
 * 		 => int a=10, int b=3
 * 			double d = a/b => 3.0
 * 				정수/정수 = 정수
 * 				정수/실수 = 실수
 * 
 * 	 = 강제형변환
 * 		= Up Casting
 * 		= Down Casting
 * 	1. 데이터형의 크기
 * 	   =====> Up Casting
 * 	   byte < char < int < long < double
 * 				     Down Casting <=====
 * 	2. 연산자 : 같은 데이터형만 연산 가능
 * 			  double + int (x)
 * 			  int + int (o)
 * 			  double + double (o)
 * 	   10.5+10 = 20.5
 * 
 * 	   10.5+10
 * 			-- 
 * 	   	   10.0
 * 	   -------
 * 
 * 	   10+'A'
 * 		  ---
 * 		   65
 * 	   ------> 자동 형변환
 * 
 * 	 1. 변수의 데이터형
 * 		= 정수 => int
 * 	 	= 실수 => double
 * 		= 문자열 => string
 * 		= 논리형 => boolean
 * 		= 날짜 => Date
 * 		------------------- 오라클 데이터형
 * 	 2. 형변환
 * 		int => double : 평균, 나누기
 * 		double => int : 저장용도에 따라
 * 		char => int : 
 * 		int => char : 
 * 		long => int : 파일 크기 (long)를 int로 바꿈
 *   3. 변수 선언 
 *   	데이터형 변수명
 *   	*** 지역변수 => 반드시 초기값을 설정해야함
 *   		  | 메소드 안에서 선언되는 변수 => 스택에 저장 => 메소드 종료시에 자동으로 사라지는 변수
 *   	초기값 대입 방법
 *   	- 명시적 : 직접 값 대입
 *   	- 입력값 : Scanner / BufferedReader
 *   			 scanf() / input()
 *   	- 난수값 : 임의값 추출
 *   	같은 데이터형
 *   	- int a,b,c,d,e;
 *   	  a=b=c=d=e=0;
*/
public class 데이터형변환_1 {
	public static void main(String[] args) {
		
	}
}
