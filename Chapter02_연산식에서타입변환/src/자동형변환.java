/*
 * 	1. 연산자 => 단항연산자/이항연산자(산술연산자)
 * 	   1) 기본 : 변수/연산/제어문
 * 	   2) 데이터를 묶어서 사용
 * 		  ---------------
 * 	  	  같은 데이터 : 배열
 * 		  ***다른 데이터 : 객체
 * 	   3) 관련된 명령문 : 기능
 * 		  게시판 => 목록출력/글쓰기/상세보기/수정/삭제
 * 			=> 기능(메소드)
 * 			=> 재사용 가능
 * 			=> 기능 추가 => 답변/수정 => 목록(이미지)
 * 	   2025-07-22 정리
 * 	   -------------
 * 	   1. 자바실행 과정 => 클래스명과 파일저장명이 동일(대소문자 구분)
 * 	   		=> EditPlus / 울트라Edit
 * 			=> A.java ======== A.class ======== 실행
 * 			   원시소스	 |	   바이트코드(0,1)|
 * 					   javac			  java
 * 					   컴파일				 인터프리터
 * 				  (컴퓨터언어로 변경)	 (한줄씩 읽어서 출력)
 * 						 |				    |
 * 					  컴파일영역			   실행시	
 * 				      ------- 문법	 	   입력값
 * 					 => 프로그래머 문제		 => 사용자 문제
 * 			=> 프로그램 개발시 다시 사용해야되는 데이터 필요
 *          => 메모리에 저장 : 변수
 *          변수 : 한개의 데이터만 저장하는 메모리 공간의 이름
 *          						 ----- 주소값
 *          변수를 사용하려면 메모리 크기를 기억해야함
 *          			  --------- 데이터형/자료형
 *          정수
 *          - byte : 8bit => 1byte
 *          - int : 32bit => 4byte
 *          	=> 컴퓨터는 모든 정수를 int로 인식
 *          - long : 64bit => 8byte
 *          실수
 *          - double : 8byte => 소수점 15자리
 *          문자 : 문자 한개만 저장 => 0~65517(각국의 언어 사용)
 *          - char => ''
 *          논리 : 제어문/연산자(비교연산자, 부정연산자, 논리연산자)
 *          	  ---- 조건문, 반복문
 *          	  boolean => true/false
 *          문자열
 *          	String : 일반 데이터형 / 참조 데이터형
 *          	------ 기능 
 *          
 *          변수 선언 : 변수는 반드시 초기값을 부여해야함
 *          --- 변경 가능, 상수 : 변경 불가능
 *          	데이터형 변수, final 데이터형 변수
 *          			    ----- 상수 
 *          1. 선언
 *             값 저장
 *             데이터형 변수;
 *             변수 = 값
 *          2. 선언과 동시에 값을 부여
 *             데이터형 변수명 = 값;
 *             				 --- 리터럴
 *             int a=10
 *      ---------------------------------------------
 *      정수 표현법
 *       - 10, 20,... => 10진법
 *       - 0b11100, 0B => 2진법
 *       - 0123 => 8진법
 *       - 0x, 0X => 16진법
 *      문자 표현법
 *       'A', 'B'
 *      문자열 표현법
 *       "ABC..." 
 *      => 문장이 길 경우 """ """
 *      -------------------------------------------
 *      형변환
 *       자동형변호나
 *        = 변수에 값 대입
 *         int a='A'
 *         		 --- char => int(65)
 *         byte < char < int < long < double
 *         double d=10;
 *         			-- int => double (10.0)
 *         int a=d; => 오류
 *         a >= d
 *         a > d : 형변환
 *         a = d : 유지
 *        = 연산처리(데이터형이 동일할 때 연산처리)
 *         => 큰 데이터형으로 변경후에 처리
 *         int + int => int
 *         long + int => long
 *                --- long 변환
 *         10 + 'A' => 10 + 65(char A) => 75
 *         double + long + int + char = double
 *         char + char = int 
 *         byte + byte = int
 *         char + byte = int
 *         ***int 이하 데이터 (byte, char, short) 
 *          => 연산처리가 되면 결과값은 int 
 *          
 *         결과값 int => int, long, float, double
 *         결과값 long => long, float, double
 *         결과값 float => float, double
 *        
 *      강제형변환
 *         (데이터형)값
 *         --------
 *         => 큰데이터형 변경 => UpCasting
 *         => 작은데이터형 변경 => DownCasting
 *         
 *         (double)10 => 10.0
 *         (int)'A' => 65
 *         
 *         (char)65 => 'A'
 *         (int)10.5 => 10
 *         
 *         *** boolean은 변환이 안됨
 *         
 *         String : 모든 데이터형을 문자열로 변환 가능
 *         int => String => int
 *          String.valueOf(10) => "10"
 *          					Integer.parseInt("10") => 10
 *          
 *         long => String => long
 *          String.valueOf(10L) => "10"
 *          					Long.parseLong("10") => 10L
 *          
 *         double => String => double
 *          String.valueOf(10.5) => "10.5"
 *          					Double.parseDouble("10.5") => 10.5
 *          
 *         boolean => String => boolean
 *          String.valueOf(true) => "true"
 *          					Boolean.parseBoolean("true") => true
 *          
 *         => 각 데이터형을 쉽게 사용할 수 있게 클래스화 => Wrapper
 *          int => Integer
 *          long => Long
 *          double => Double
 *          boolean => Boolean
 *          ...
 *          
 *       ** 윈도우 개발 / 웹 개발 => 적용되는 모든 데이터는 String
 *       
 *       입출력
 *       System.out.println() : 가장 많이 사용
 *       ---------------------> 웹 => 입력값 확인, 오류 메세지 출력
 *       사용하면 줄바꿈 
 *       System.out.print() : 문법 사항 => 줄바꿈이 안됨
 *       System.out.printf() : 출력 서식을 만들어서 출력
 *       					   -> C언어에서 주로 사용
 *       printf("서식", 값,...)
 *               --- 정수값 : %d
 *                          --- 정렬
 *                          왼쪽 / 오른쪽
 *                          %-3d  %3d
 *                          90
 *                          %-5d
 *                          9 0
 *                          _ _ _ _ _ 
 *                   실수값 : %f
 *                   		%.2f
 *                   		%.3f
 *                   		%.1f
 *                   문자 : %c
 *                   문자열 : %s
 *                   
 *                   *** 특수문자
 *                   \n : 줄바꿈
 *                   \t : 일정 간격(탭 한칸)
 *                   \" : " 출력 => HTML 전송할 때, MyBatis 
 *                   \\ : \ 출력 => 경로명 
 *       ----------------------
 *       Scanner 
 *       ------- 클래스화 => 키보드 입력값
 *       Scanner scan = new Scanner(System.in)
 *       ------- ----	--- 		---------
 *       		  변수   저장 	    키보드 입력값
 *       사용자 정의 데이터형
 *       
 *       1. 정수 => scan.nextInt()
 *       2. 실수 => scan.nextDouble()
 *       3. 논리 => scan.nextBoolean()
 *       4. 문자열 => scan.next()
 *       
 *       입력 : 공백 => 메모리에 저장 => 엔터일 때
*/
import java.util.Scanner; // java.util.*; 은 모든 클래스를 다 불러오기 때문에 속도가 느려짐(자제)
/*
 *  class Scanner
 *  {
 *  }
 *  
*/
public class 자동형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자동형변환 a=new 자동형변환(); 
		 * System.out.println(a); 
		 * 자동형변환 b=new 자동형변환();
		 * System.out.println(b);
		 */
		
//		byte b1=10;
//		byte b2=20;
//		int b3=b1+b2;
		
		Scanner scan=new Scanner(System.in);
//		System.out.print("국어 점수:");
//		int kor=scan.nextInt();
//		System.out.print("영어 점수:");
//		int eng=scan.nextInt();
//		System.out.print("수학 점수:");
//		int math=scan.nextInt();
//		System.out.print("국어 영어 수학입력(90 90 90):");
//		int kor=scan.nextInt();
//		int eng=scan.nextInt();
//		int math=scan.nextInt();
//		System.out.printf("%3d%3d%3d\n",kor,eng,math);
		//System.out.print("문자열 입력:");
		//String msg=scan.nextLine(); //공백도 포함해서 읽기
		//System.out.println(msg);
		System.out.print("true/false입력:");
		boolean b=scan.nextBoolean();
		System.out.println(b);
		System.out.print("실수 입력:");
		double d=scan.nextDouble();
		System.out.println(d);
	}

}
