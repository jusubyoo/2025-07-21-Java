/*
 *  프로그램 : 순차적
 *  		 위애서 아래 => 한줄씩 번역
 *  프로그램의 종류
 *   - 평문 : 일반 명령문만 수행 => HTML / CSS
 *   		=> 문법사항 : 변수선언, 연산처리, ...
 *   - 조건문 : 필요시에만 명령문을 수행
 *   		  => 상황에 따라서 다른 기능을 수행
 *   		  => 검색 : 사이트
 *   		  => 상세보기
 *   		  => 로그인 처리 / 아이디 중복체크 / ID, PW 찾기
 *    1) 단일 조건문
 *    	=> 독립적 조건문 하나하나 검색 
 *      => 속도가 늦다
 *      => 중복적으로 수행
 *         1~100 => 3의 배수, 5의 배수, 7의 배수
 *      => 조건이 true일때만 수행
 *    2) 선택 조건문
 *    	 => 조건이 true/false
 *    	 => 웹에서 사용빈도가 많다
 *    			 ------
 *    			-> 결과값 전송
 *    3) 다중 조건문 => 메뉴
 *    	 => 한개의 문장만 수행 => 조건에 맞는 if만 찾는다
 *    	 => 메뉴 제작
 *    4) 중첩 조건문 : A => A+, A0, A-, ...
 *    	 -------- (조건) && (조건)
 *    
 *  1. 단일조건문 => 문법 / 형식
 *     형식) 자바에서 지원하는 모든 제어문은 바로 밑에 있는 문장만 제어
 *          -> 여러개의 문장을 제어 할때 : {}
 *          => 가독성 / 수정 편리
 *          제어문에 특별한 경우가 아니면 ;을 사용하지 않는다
 *          if(조건문)
 *          {
 *          	명령문;
 *          }
 *  2. 실행순서 => 형식, 문법, 실행
 *     if => 필요하면 명령문을 수행, 필요없는 경우에는 건너뛴다
 *     		 필요시마다 상황을 다르게 만들어줌
 *     		 왼쪽 / 오른쪽 / 위 / 아래
 *     		| false => 건너뛴다 
 *     if(조건문) 
 *     {    | true => 실행
 *     	  명령문;
 *     }
 *     => mno==1 => 영화의 번호가 같은 경우
 *     => String : equals / contains / startsWith / endsWith
 *     => <button> / <select>
 *     
*/
// 최대값, 최소값 구하기 => 정수를 3개 입력을 받아서
/*
 *  난수
 *   Math.random() => 임의의 실수를 추출 (0.0~0.99)
 *   
 *   1~100 : (int)((Math.random()*100)+1) => (0.0~99.0)+1 
 *   	   => (int)(1.0~100.0) => 1~100
 */
public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)((Math.random()*100)+1); // 1~100
		int b=(int)((Math.random()*100)+1);
		int c=(int)((Math.random()*100)+1);
		// 같은 블록에서는 변수명이 중복이 되어선 안된다
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int max=a; // 임의의 초기값 => 1
		// 조건 true 수행 / false일때는 수행하지 않는다
		if(max<b)
		{
			max=b;
			System.out.println("max<b 문장 수행");
		}
		System.out.println("첫번째 if문 건너뛰기...");
		if(max<c)
		{
			max=c;
			System.out.println("max<c 문장 수행");
		}
		System.out.println("두번째 if문 건너뛰기...");
		System.out.println("max="+max);
		int min=a; // 임의의 초기값 => 100
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("min="+min);
	}

}
