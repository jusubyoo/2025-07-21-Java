/*
 *  인스턴스 변수 : 메모리저장할 때 따로 저장되는 변수
 *				저장시기 => new
 *  		    - 지역변수 : 메소드가 종료되면 사라지는 변수
 *      			      => Stack => {} 메모리 => 자체관리
 *         		--------
 *          	메소드의 목적 => 반복되는 기능 제거
 *          	ex) DB          
 *                  --------  
 *          		모든 기능
 *          		오라클 연결
 *          		기능 처리
 *          		오라클 닫기
 *              - 소스가 간결해진다
 *              - 재사용(다른 클래스와 연결)
 *                -------------------
 *                오버로딩 / 오버라이딩 => 메소드 이용
 *              - 단락을 나누는 과정
 *                => 코드 관리가 쉽다
 *                => 가독성
 *              *** 프로그래밍에서 중요한 것 
 *                  => 가독성, 최적화(scp,async), 수정/추가, 공통으로 사용되는 기능(공통모듈)
 *           -------------------------------
 *            생성자 : 변수에 대한 초기화
 *            	 	 => 프로그램에서 가장 먼저 호출
 *            		 => 시작과 동시에 구현
 *            		 => 서버 / DB 연결 / 화면 UI
 *            		 => 자동로그인
 *            		 => 메소드의 일종
 *            		 => . 대신 new 생성자()
 *            *** 함수/메소드 
 *                => 기능처리는 동일
 *                => 함수는 독립적, 메소드는 독립적이지 않고 클래스영역에서 처리(클래스 종속)
 *            *** 라이브러리 / 프레임워크
 *                | 완제품    | 레고(우리가 조립)
 *           ------------------------------------------------------------
 *           
 *    2) 메소드
 *    - 형식
 *     [접근지정어][제어어] 리턴형 메소드명(매개변수 목록)
 *     {
 *        명령문
 *        return 값;
 *     }
 *     - 접근지정어 : public, private, protected, default(같은 폴더 안에서만 접근 가능)
 *     - 제어어 : static, final, abstract
 *       - static => 컴파일시에 자동으로 저장
 *     - 리턴형 : 처리 결과값
 *       => 기본형(int, long, double, char, String...)
 *       => 데이터가 여러개 : 배열/클래스(한개의 이름)
 *       => 자바는 리턴형을 반드시 1개만 사용 가능
 *       => 메소드 자체 처리 : 출력, 추가, 삭제, 수정 => void
 *       int 메소드명()
 *       {
 *         return 값; => int, char, short, byte 등 int보다 작거나 같은 값
 *       }
 *     - 메소드명 : 식별자 => 알파벳(권장), 한글 사용
 *     			 대소문자 구분 => 소문자로 시작
 *     			 숫자 사용 가능(앞에는 불가능)
 *     			 키워드 사용 금지
 *     			 공백없이 사용
 *     			 => 가급적이면 의미 부여
 *     - 매개변수 : 사용자 요청 데이터
 *       - 가공 => 결과값 도출
 *       - 0, 1, 여러개
 *       ex)
 *       - 검색요청 (검색어 1개)
 *       - 로그인 (id,pw 2개)
 *       - 회원가입 (id,pw,name,email,...) => class
 *       - 정렬 => 배열
 *       
 *       - 동작 
 *         호출 => 매개변수 => 처리 => 결과값 리턴
 *       - 기본 : 재사용 / 다른 클래스 통신
 *         => 반드시 한개의 기능만 수행
 *         => 최대한 세부적으로 분리
 *         
 *       - static void aaa(int a){}
 *         => 같은 클래스에서 호출
 *            aaa(10)
 *                -- 실제 값 주입
 *         => 다른 클래스에서 호출
 *            클래스명.aaa(20)
 *       - static int aaa(int a,int b){}
 *         => int a=aaa(10,20)
 *       - 메소드를 호출할 경우
 *         => 처음부터 끝까지 수행 => 호출한 위치로 원상 복귀
 *       - 메소드 종료 : return이 있는 곳에서 종료
 *       
 *       - 특별한 경우가 아니면 void에는 return 생략
 *         void aaa()
 *         {
 *           컴파일러가 return 자동 추가
 *         }
 *         
 *   void aaa(int a)
 *   {
 *     System.out.println("진입");
 *     System.out.println("요청값="+a);
 *     System.out.println("종료");
 *   }
 *   
 *   aaa(1) => 진입 => 요청값=1 => 종료
 *   aaa(2) => 진입 => 요청값=2 => 종료
 *   aaa(3) => 진입 => 요청값=3 => 종료
 *   
 *   void bbb()
 *   {
 *     int a=10;
 *     System.out.println(a)
 *     a++;
 *   }
 *   
 *   bbb() => 10 
 *   bbb() => 10
 *   bbb() => 10
 *   
 *   절차적 언어 => 재사용 불가능 (소스 수정이 어렵다)
 *       | 개선
 *   구조적 언어 => 재사용 가능, 게임 다시 수행
 *               내용이 관련된 소스들만 모아서 관리하여 수정이 편하다
 *               구조적인 프로그램 (메소드)
 *               -------------------
 *               매개변수, 리턴형이 너무 많다 => 해결: 
 *               전역변수 도입
 */
import java.util.*;
//  숫자야구게임 
/*
 *  - 난수 발생 : 임의의 수 3개 추출
 *  - 사용자 입력 받기
 *  - 숫자 입력시 비교
 *  - 힌트
 *  - 종료여부 확인
 *  ---------------- 메소드 5개
 *  => 전체 조립
 *  ---------------- process()
 *  
 *  1. 매개변수 전송
 *  2. 호출 위치
 *  3. 다시 게임 시작 => 재귀호출
 *  -----------------------
 *  
*/
public class 메소드_1 {
	
		// 재사용이 어렵다
//		int[] com=new int[3];
//		for(int i=0;i<com.length;i++) 
//		{
//			com[i]=(int)(Math.random()*9)+1;
//			for(int j=0;j<i;j++)
//			{
//				// j는 이미 저장, i는 발생된 난수
//				if(com[j]==com[i])
//				{
//					i--;
//					break;
//				}
//			}
//		}
//		return com;
	
// 절차적 언어 => 구조적 언어 => 객체지향(OOP) => 횡단지향(AOP)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		for(int i=0;i<com.length;i++) 
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				// j는 이미 저장, i는 발생된 난수
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
		// 사용자 입력 받기
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			// 사용자 입력이 시작되는 곳
			System.out.print("세자리 정수 입력: ");
			int input=scan.nextInt();
			// 오류처리 => 입력이 잘못된 경우
			/*
			 *   1. 세자리 정수가 아닌 경우
			 *   2. 중복된 수 입력
			 *   3. 0을 입력하는 경우 
			 */
			if(input<100 || input>999)
			{
				System.out.println("※ 잘못된 입력입니다 ※");
				// 다시 처음부터 실행 => while문의 조건식 이동
				continue;
			}
			user[0]=input/100;
			user[1]=(input&100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("※ 중복된 수는 사용할 수 없습니다 ※");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("※ 0은 사용할 수 없습니다 ※");
				continue;
			}
			
			// 비교 => 힌트 => s:같은 위치의 같은 값, b:다른 자리에 같은 값
			int s=0,b=0;
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
				// 힌트
				System.out.printf("Input Number:%d,Result:%dS-%dB\n",
						input,s,b);
				if(s==3)
				{
					System.out.println("★ 정답입니다 ★");
					break;
				}
			}
			
		}
		
	}
}
