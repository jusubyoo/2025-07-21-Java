/*
 *  1) 문장의 구성요소
 *     public class ClassName
 *     				--------- 변수 식별자와 동일
 *     				--------- 시작 문자는 대문자(규칙)
 *     {
 *      프로그램에서 제일먼저 실행하는 메소드(기능)
 *      main이 없는 경우에는 프로그램 구동이 안된다
 *      시작/종료 => 프로그램에서 반드시 main 한개 이상 존재
 *      main => JVM에서 제일 먼저 호출
 *      public static void main(String[] args)
 *      => static public void main(String[] args)
 *     	{
 *     		소스 코딩
 *      }
 *     }
 *     
 *     - public : 누구나 이용 가능(오픈) => private
 *     	 => 접근 지정이 (public private protected default)
 *     - static : 정적메소드
 *     	 => 메모리 할당없이 사용 가능
 *     - void : 모든 메소드는 결과값을 돌려준다
 *     			실행 결과값이 없는 상태
 *     - main : 메소드 이름
 *     		    => 한개의 기능
 *     - String[] args : 외부에서 데이터를 입력받을 때 사용 
 *     			=> 파일명, 변수값,...
 *     
 *     main이 포함된 클래스 => 실행하는 클래스
 *     
 *     => 변수 / 연산자 / 제어문 / 배열 / 메소드제작
 *     		=> 객체 지향 프로그램
 *     		=> 클래스의 종류
 *     		=> 예외처리
 *     		=> 라이브러리 => 네트워크(쓰레드), 데이터베이스
 *     		=> 프로그램 제작
 *     => main을 실행
 *     ClassName.java ======= ClassName.class ======= 실행
 *     					 |						 |
 *      			   javac			        java
 *     ClassName.class ==> ClassName.java 변경 가능
 *     				    |
 *     				  javap => 변수 / 메소드명만 처리
 *     1. 프로그램 문장
 *     	  => 사용자가 컴퓨터에게 작업을 지시하는 코드의 단위
 *     						------------ CPU
 *     		 명령을 내려서 컴퓨터가 동작을 할 수 있게 만들어줌
 *     		 => 사용자 대신 개발자가 코딩
 *     		 => 사용자 중심 프로그램 => 요구사항 분석
 *     2. 명령문이 종료가 되면 ; 사용
 *     3. 문장이 길어지면 {} => 단락을 나눠서 처리
 *     
 *     int a=10; => 4바이트 메모리를 만들어서 10을 저장
 *     				메모리 주소는 a라는 이름으로 설정
 *     a=20; => 10을 지우고 20일 저장한다
 */
public class 정리_1 {
	
	public static void main(String[] args)
	throws Exception
	{
//		Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
//								  +"http://www.daum.net");
		
		
	}
}
