/*
 *  1. 식별자
 *     - 알파벳, 한글로 시작한다 (알파벳은 대소문자 구분)
 *     - 숫자 사용 가능 (앞에는 불가능)
 *     - 키워드 사용 불가능 (빨간색)
 *     	 ----- 자바에서 사용되는 단어
 *     - 공백 금지
 *     - 특수문자 사용 가능 (_, $)
 *     -------------------------------------------
 *     변수 / 상수
 *     클래스 / 인터페이스
 *     메소드
 *     
 *     => 구분(약속)
 *     	  - 변수는 소문자 시작 (두개이상 단어)
 *     		 file_name fileName
 *     	  - 상수는 모든 문자를 대문자로 사용
 *     	  - 클래스는 대문자 시작
 *     		 File_Name FileName
 *     	  - 인터페이스 => 클래스와 동일
 *     	  - 메소드는 변수와 동일
 *   2. 다중조건문
 *   	=> 메뉴 / 네트워크 (내부 프로토콜) / 데이터베이스 => SQL
 *   	=> 게임 => 키 값에 따라서 상황 변경
 *   형식)
 *   if(조건문)
 *   {
 *   	실행문장
 *   } 
 *   else if(조건문)
 *   {
 *   	실행문장
 *   }
 *   else if(조건문)
 *   {
 *   	실행문장
 *   }
 *   ...
 *   else
 *   {
 *   	실행문장
 *   }
 *   
 *   => 단일 조건문 여러개와 차이점
 */
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어: ");
		int kor=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		System.out.print("영어: ");
		int eng=scan1.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.print("수학: ");
		int math=scan2.nextInt();
		
		double avg=(kor+eng+math)/3.0;
		
		System.out.println("===== 결과 =====");
		char score='A';
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else
			score='F';
		System.out.println("학점: "+score);
	}

}
