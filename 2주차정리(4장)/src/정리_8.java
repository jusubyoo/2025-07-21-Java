/*
 *  문자열 저장
 *  -------- 기능
 *  String : 데이터형+클래스
 *  			   ---- 기능처리(메소드)
 *  println() print() => 화면 출력, random() 임의 실수 추출
 *  
 *  1. 저장 방법
 *     String 변수명="문자열" => 제한이 없다
 *  2. 문자열 제어가 가능하게 기능처리(메소드 제공)
 *     메소드
 *     ----
 *      1. 리턴형
 *      2. 메소드명
 *      3. 매개변수
 *      4. 어떤 기능인지 확인
 *      ---------------- 라이브러리 -> 이미 제작이 되어있다 
 *      => 암기의 부분(String=>변경불가능=>모든 개발자가 동일하게 사용)
 *      => 변경이 안되는 클래스
 *         String, System, Math => 종단 클래스(final)
 *      => 형태
 *         리턴형 메소드명(매개변수_list)
 *         ---- ----- ------------
 *         1) 문자의 갯수 : length() 
 *            => 원형 : int length() => .(주소 접근 연산자)
 *         2) toUpperCase() : aaa => AAA 대문자변환
 *            toLowerCase() : AAA => aaa 소문자변환
 *            => 원형 : String toUpperCase()
 *                     String toLowerCase()
 *         3) substring() => 원하는 문자열을 자를 때 사용
 *            => 원형 : String substring(int beginIndex)
 *            		   => beginIndex부터 마지막 문자까지 자른다
 *            		   Hello Java
 *            		   0123456789
 *                     String substring(int beginIndex,int endIndex)
 *                     								   ------------ endIndex-1
 *               *** 메소드는 같은 이름으로 제작할 수 없다
 *               *** 예외조건 : 매개변수의 갯수나 데이터형이 다르면 다른 메소드로 인식
 *               			 => 오버로딩
 *                  
*/
public class 정리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="0123456789";
//		System.out.println("갯수: "+s.length());
//		String s1="Hello 자바 12345";
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1); // 원본은 변경되지 않는다
		
		String s="0123456789";
		
		System.out.println(s.substring(5));
		s=s.substring(5,9);
		System.out.println(s);
		System.out.println(s);
	}

}
