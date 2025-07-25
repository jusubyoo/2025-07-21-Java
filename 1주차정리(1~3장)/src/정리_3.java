// 변수 / 연산자 / 제어문
/*
 * 변수 => 데이터 저장 => 연산 처리
 * --- 				  --------
 * 						  |
 * 					  응용 : 제어문
 * 변수+연산자+제어문 => 메소드
 * 메소드 여러개 묶음 => 클래스
 * 클래스 여러개 묶음 => 패키지 => .jar
 * 
 * 연산자
 * 1) 단항연산자
 * 	- 증간연산자 (++,--)
 * 		전치연산자 : 먼저 증가   ==> ++a
 * 		후치연산자 : 나중에 증가  ==> a++
 * 	- 부정연산자 (!) : 부정
 * 					boolean에서 사용 가능
 * 					true=>false, false=>true
 * 					=> 조건문
 * 					   - 삼항연산자
 * 					   - if
 * 	- 형변환연산자 (데이터형)
 * 
 * 2) 이항연산자
 * 	- 산술연산자 (+,-,*,/,%)
 * 	   => 자동형변환
 * 		 => 큰데이터형으로 변경후 연산
 * 			-------------------- 연산은 같은 데이터형끼리만 연산 가능
 * 	- 비교연산자 (==,!=,<,>,<=,>=)
 * 		=> 숫자만 비교 가능(실수, 정수, 문자(숫자취급))
 * 		=> 예외 (boolean : ==, !=)
 * 		=> 조건문/반복문에서 주로 사용
 * 		   ----- 삼항연산자
 * 		   <= < || ==
 * 		=> 결과값 => boolean
 * 		=> 문자열비교 => equals
 * 	- 논리연산자 (&&,||)
 * 		(조건) && (조건)
 * 	  true		true  => true
 * 	  true		false => false
 * 	  false		true  => false
 * 	  false		false => false
 * 	  ------------------------ 두 조건이 모두 true일 경우만 true
 * 		효율적인 연산 => 왼쪽에 있는 조건이 false면
 * 					  오른쪽에 있는 조건은 수행하지 않는다
 * 		=> ex) 범위, 기간 포함 여부 확인
 * 				    --- 예약 가능
 * 			   --- 페이징/점수
 * 			   --- 오라클 : Between ~ AND
 * 		(조건) || (조건) => 조건 : true/false
 * 		-----	 -----			---------- 부정,논리,비교연산자
 * 		  |		   |
 * 		  ----------
 * 			   |
 * 		  true / false
 * 	  true		true  => true
 * 	  true		false => true
 * 	  false		true  => true
 * 	  false		false => false
 * 	  ------------------------ 한개 이상의 true가 있는 경우 true
 * 	  왼쪽 조건이 true면 오른쪽은 수행하지 않음
 * 	  사용 => 범위, 기간외, ... 잘못된 입력인 경우 => 오류 처리
 * 	  
 *    알파벳 소문자 조건 : c >= 'a' && c < 'z'
 *    알파벳 대문자 조건 : C >= 'A' && c <= 'Z'
 *    
 *    범위외
 *    a<0 || a>100
 *    
 *    세자리 정수 입력
 *    a>=100 && a<1000 or a<=999
 * 	 
 * 	- 대입연산자 (=,+=,-=)
 * 		= 대입
 * 		+=, -= : 복합대입연산자
 * 
 * 3) 삼항연산자 ((조건)?값1:값2)
 * 				 | true => 값1
 * 				 | false => 값2
 * 	  => 소스가 간결 
 */
public class 정리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=10;
//		int y=10;
//		int z;
//		
//		x++;
//		++x;
//		System.out.println("x="+x);
//		System.out.println("=====");
//		
//		y--;
//		--y;
//		System.out.println("y="+y);
//		System.out.println("=====");
//		
//		z=x++;
//		System.out.println("z="+z);
//		System.out.println("=====");
//		
//		z=++x;
//		System.out.println("z="+z);
//		System.out.println("x="+x);
//		System.out.println("=====");
//		
//		z=++x + y++;
//		System.out.println("x="+x);
//		System.out.println("y="+y);
//		System.out.println("z="+z);
//		
//		System.out.println("=====");
//		boolean bCheck=false;
//		System.out.println(bCheck);
//		System.out.println(!bCheck);
//		System.out.println("=====");
//		System.out.println(65.0);
//		System.out.println((int)65.0);
//		System.out.println((char)65.0);
//		System.out.println((double)'A');
//		System.out.println((double)65);
		/*
		 * byte < char < int < long < double
		 * 숫자 관련만 가능(boolean 제외)
		 */
//		int i=65;
//		char c=(char)i;
		
		char c1='A';
		char c2='B';
		int c3=c1+c2;
		
		byte b1=10;
		byte b2=20;
		int b3=b1+b2;
	}

}
