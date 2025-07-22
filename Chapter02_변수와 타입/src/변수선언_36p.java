/*
 *	1. 개념 => 변수, 연산자, 제어문, 배열
 *			  메소드, 클래스, 객체, 캡슐화, 다형성
 *			  추상클래스, 인터페이스, 내부클래스, 예외처리
 *	메모리 
 *	-------자바-------
 *	     Method
 *	   ------ -------
 *			  static -> 정적변수
 *		메소드  -------
 *	
 *	   ------ -------
 *	-----------------
 *		  Heap : 프로그래머가 사용하는 공간 => class 저장,배열 => 사용자 정의
 *	-----------------
 *		 Stack : 메모리 관리 => 지역변수/매개변수
 *	-----------------
 *
 *	
 *	2. 분류
 *	3. 선언방식
 *	4. 예시
 *	5. 주의사항 
 *
 *  변수 : 하나의 값을 저장하는 메모리 주소의 붙여진 이름
 *  1. 정적 타입 언어 
 *     => 메모리 크기를 자바에서 지정 => 기본형
 *     	  -------- 메모리 사용의 최적화
 *     			   오류 방지
 *     			   가독성 향상
 *     	  String / int / double / boolean
 *     
 *     => 저장 크기
 *        1byte 2byte 4byte 8byte
 *        	byte => bit가 8개
 *        			--- 0, 1만 저장하는 공간
 *        1byte
 *        
 *        ---------------
 *        0 1 1 1 1 1 1 1
 *        ---------------
 *        부호 비트(0 시작=>양수, 1 시작=>음수)
 *      분류
 *       정수 100 => -101 
 *        - byte : -128~127
 *        		=> 네트워크 전송 / 파일 업로드, 다운로드
 *        - short : -32768~32767
 *        		=> C언어 호환
 *        - int : -2147483647~2147483646
 *        		=> 가장 많이 사용되는 정수
 *        		=> 컴퓨터의 디폴트
 *        - long : -2^63+1~2^63 
 *        
 *       실수 => 정밀도
 *        - 4byte : 7자리 => float(f)
 *        - 8byte : 15자리 => double(d) => default => d는 생략 가능
 *        
 *       문자 : char => 2byte
 *       논리 : true/false => 1byte => boolean
 *       	   => 조건문 / 반복문
 *       -------------------------------------
 *       		1byte	2byte	4byte	8byte
 *       -------------------------------------
 *       정수    byte    short    int 	 long  => 모든 숫자는 int가 디폴트
 *       -------------------------------------  
 *       실수					float	double => 모든 실수는 double이 디폴트
 *       -------------------------------------
 *       문자			char
 *       -------------------------------------
 *       논리   boolean
 *       -------------------------------------
 *       byte < short,char < int < long < float < double (정수<실수) ***암기
 *       
 *      변수 선언
 *      크기지정 변수명;
 *      ------ int / double / char / ...
 *         
 *  2. 동적 타입 언어
 *     => 메모리 크기를 프로그래머가 지정 => 참조형(배열,클래스)
 *     
 *     => 지역변수 : 스택 공간 => 메모리에 의해 관리
 *     	=> 자동 메모리 해제 
 *     변수명 설정(식별자)
 *     -> 같은 공간에서 같은 이름의 변수는 사용할 수 없음
 *     식별자
 *     1) 알파벳 / 한글 사용 가능
 *     	  주의점 : 알파벳 사용시 대소문자 구분
 *     			  ex) int a, int A
 *     2) 숫자 사용 가능
 *        주의점 : 앞에 사용 불가능
 *     3) 특수문자 사용 가능 ex) _ , $
 *                           |
 *                       단어 2개, 임시변수
 *                       file_name file_size
 *                       _temp
 *     4) 키워드 사용 불가능
 *        ---- 자바에서 이미 사용하는 단어
 *        int, byte, ...
 *     5) 공백 사용 불가능
 *     	  int file name
 *            --------- file_name, fileName
 *        A = 65, a = 97
 *        char c=65; ---> c = A
 *        int b='a'; ---> b = 97
 *        char a=97 ----> a = 'a'
 *        double d=10 --> d=10.0
 *        
 *        식별자 변수 = 값;
 *        -> 변수 >= 값
 *        
 *       
*/
public class 변수선언_36p {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		b=false;
		System.out.println(b);
		
		char c='A';
		char c1=65;
		c='B';
		System.out.println(c);
		System.out.println(c1);
		
		//상수=>모든 문자가 대문자
		final int ABC = 100;
		// final 붙이면 상수, final 없으면 변수
		System.out.println(Long.MAX_VALUE);
		
		int ii=(int)10.5;
		System.out.println(ii); // down casting
		System.out.println((int)'B'); // up casting
		
		
	}

}
