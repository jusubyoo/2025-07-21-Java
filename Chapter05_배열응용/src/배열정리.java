/*
 *   1. 배열 
 *      - 선언 : 배열의 갯수
 *      - 초기화 : 명시적 초기화, ***파일 읽기, ***데이터베이스 읽기, ***크롤링, 임의 추출, 입력값 
 *      - 출력 : 일반 for, for-each
 *      - 종류 : 정수배열, 문자열 배열
 *   2. 배열 특징
 *      - 변수는 한개만 저장하는 메모리 공간
 *        => 변수 여러개를 묶어서 한번에 저장공간을 설정
 *        => 데이터 관리를 쉽게 만들어준다
 *      - 문법 : 데이터형, 변수, 연산자, 제어문
 *        --- 묶는 것
 *            ----- 라이브러리를 연결해서 조립
 *      
 *      => 로그인 : if~else
 *      => 회원가입 : if~else
 *      => 목록 : for
 *      => 예약 : if => for
 *      
 *   단점 : 한번 선언하면 변경이 불가능하다
 *   ex) int[] arr=new int[5];
 *       arr=new int[10];
 *       => 주소가 변경되는 것이라 변경은 되지만 내용은 날아간다
 *   
*/
public class 배열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== 주소와 실제 값 비교 =====");
		int[] arr=new int[5];
		System.out.println(arr);
		int[] arr2=arr;
		System.out.println(arr2);
		
		arr[0]=100;
		System.out.println(arr[0]);
		int[] arr3=arr.clone();
		arr3[0]=1000;
		System.out.println(arr[0]);
		
		System.out.println("===== 크기 늘리기 =====");
		int[] arr4= {1,2,3,4,5};
		int[] arr5=new int[10];
		for(int i=0;i<arr4.length;i++) {
			arr5[i]=arr4[i];
			System.out.print(arr5[i]+" ");
		}
		
	}

}
