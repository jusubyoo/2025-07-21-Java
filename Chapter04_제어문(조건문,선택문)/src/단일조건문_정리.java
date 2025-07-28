/*
 *  자바에서 지원하는 프로그램 형식
 *  1. 평문 : 위에서 아래로 한문장씩 수행
 *  2. 조건문 : 상황에 따라서 동작 형식 변경
 *  
 *  3. 반복문 : 중복 제거
 *  package package명 => 한번만 사용
 *  import ... => 여러개 사용 가능
 *  class ClassName{
 *  	public static void main(String[] args)
 *  	{
 *  	  1. 변수 선언
 *  	  2. 변수에 초기화
 *  	  3. 사용자 요청에 다른 처리 => 제어문
 *  	  4. 결과 출력
 *  	}
 *  }
 *  
 *  4. 조건문
 *    - 단일조건문
 *      if(조건문)
 *      { ------ true/false가 나오는 연산자 이용
 *      		   => 부정연산자/비교연산자/논리연산자
 *        조건이 true일 때 수행하는 문장
 *      }
 *      false일 경우에는 if문을 수행하지 않고 건너뛴다
 *      
 *      => 중복이 있는 경우
 *         1~100
 *         	=> 3의 배수, 5의 배수, 7의 배수 출력
 *          => 15, 21, 30, 35, 42, ... 중복
 *          => if문이 독립 문장이면 모든 if를 수행하므로 속도가 느림
 *          
 *          => 여러개 문장을 동시에 수행할 때
 *          if(조건문)
 *          {
 *            제어하는 문장 여러개 추가
 *          }
 */
public class 단일조건문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		
		if(a%3==0)
			System.out.println("3의 배수");
		if(a%5==0)
			System.out.println("5의 배수");
		
		
			
	}

}
