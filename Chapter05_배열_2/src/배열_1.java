/*
 *  Java => 기본 문법
 *  		=> 변수 / 데이터형(기본형)
 *  		=> 가공(사용자 요청)
 *  		   ------------ 연산자 / 제어문
 *  => 관리
 *     - 데이터 시작
 *       - 배열 => 한개의 이름으로 관리 (같은 데이터형)
 *       - 클래스 => 한개의 이름으로 관리 (다른 데이터형)
 *     - 소스 코딩 분리 => 문장의 단락
 *            |
 *      메소드 : 객체지향의 핵심 => 재사용
 *      
 *  일반 for 문 : Back-End
 *  for(int i=0;i<arr.length;i++)
 *  {
 *    System.out.println(arr[i])
 *  }
 *  
 *  for-each 문 : 웹
 *  for(int i:arr) => i=10 i=20...
 *  {
 *    for(받는변수:배열명)
 *  }
 *  => 실제 저장된 값을 가지고 온다(실제 데이터 출력) => 수정이 어렵다
 *  => 변경 / 초기값 설정 => 일반 for 문
 *  => 출력 => for-each => 검색
 *     자바스크립트 : map(), forEach()
 *     
 *  => 배열 : 모든 데이터형이 가능
 *     1) 정수
 *     	  int[] arr={1,2,3,4,5};
 *     	  int[] arr=new int[5]; => 임시 저장
 *           => {0,0,0,0,0}
 *           
 *     2) String[] arr={"철수", "영희", ...}
 *        String[] arr=new String[5]
 *            => {null,null,null,...}
 *               - 메모리주소가 없는 경우
 *               - NullPointerException
 *               - 초기값
 *               
 *     3) boolean[] arr={true,false,true,false,true}
 *        boolean[] arr=new boolean[5]
 *         => {false,false,false,false,false}
 *         => 좌석 예매, checkbox(이메일 체크하고 한번에 지우기)
 *     
 *                   
*/
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		
		// 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			// 인덱스 번호(변수)를 사용한다
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n===== 문자열 =====");
		String[] names= {"A","B","C","D","E"};
		
		for(String name:names) {
			System.out.print(name+" ");
		}
		System.out.println();
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		
	}

}
