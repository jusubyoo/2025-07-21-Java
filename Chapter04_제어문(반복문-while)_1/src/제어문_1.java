/*
 *  1. while => 형식
 *     => 사용처
 *     => 파일 읽기(출력) => 한글자씩 읽는다
 *     => 데이터베이스 => 갯수는 확인이 안된다 => 갯수를 확인할 수 없는 곳에서 주로 사용
 *	   => for문 : 프론트엔드, while문 : 백엔드
 *	   
 *  2. for문 => 지정 반복, while => true일 동안 반복
 *  
 *  3. while문 형식 => 반복 횟수를 지정 => for문과 동일하게 사용 가능
 *     초기값 --------- 1
 *     while(조건식) -- 2
 *     {
 *       반복실행문장 --- 3
 *       증감식 ------- 4
 *     }
 *     
 *  4. 실행이 안될 수도 있다 => 선 조건 검색
 *  ---------------------------------
 *     => for 에서 사용한 예제
 *     => while문의 고유 기능
 *     
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=1;
		while(true)
		{
			if(i>=10) break; // 위치, 변수 위치 중요
			System.out.print(i+" ");
			i++;
		}
	}

}
