/*
 *  단일조건문
 *  형식)
 *  if(조건문) : 조건문(true/false)인 연산자 사용
 *  		   => 부정연산자(!), 비교연산자, 논리연산자만 사용 가능
 *  {
 *    조건이 true일때 수행하는 문장
 *    false면 if문을 수행하지 않는다
 *  }
 *  
 *  선택조건문
 *  형식) => true일때 false일때 나눠서 작업
 *  if(조건문)
 *  {
 *    조건 true일때 수행하는 문장
 *  }
 *  else
 *  {
 *    조건 false일때 수행하는 문장
 *  }
 *  단일조건문 : 독립적 => if문마다 따로 수행
 *  다중조건문 : 한개의 문장으로 만들어져 있음
 *  		  => 조건에 맞는 문장 한개만 수행
 *  		  => 선택문 : switch~case
 *  if(조건문)
 *  {
 *    조건 true => 문장 수행 => 종료
 *    조건 false => 밑의 문장 수행
 *  }
 *  else if(조건문)
 *  {
 *    
 *  }
 *  ...
 *  else : 해당 조건이 없는 경우에 처리
 *  {
 *    (생략 가능)
 *  }
 *  
 *  => 무조건 한개의 문장만 수행 => 한개의 문장으로 만들어짐
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복 출력 => 단일 조건문 여러개
		// 중복없이 1개 수행 => 다중 조건문 사용
		int num=15;
		if(num%3==0)
			System.out.println("15는 3의 배수");
	}

}
