/*
 *  문자열 : String -> 문자 여러개를 동시에 저장
 *  
 *  저장 방법
 *   String s="문자열" => 일반 데이터형처럼 만듦
 *   String s=new String("문자열","문자코드") 
 *    => ISO-8859-1 ASC => UTF-8
 *   new : 새로운 메모리 공간에 저장해라       
 *   
 *  제어하는 기능
 *  --------- 메소드는 반드시 결과값
 *  1. 변환
 *   toUpperCase(), toLowerCase() -> 검색에서 사용
 *   *** valueOf() -> 모든 데이터형을 문자열로 변환
 *   ex) String valueOf(10) => "10"
 *  2. 제어
 *     문자 자르기
 *     String substring(int beginIndex)
 *     String substring(int beginIndex, int endIndex)
 *     									------------ endIndex-1
 *     문자를 자른다 => 구분자 문자별 
 *     green, blue, black
 *     String[] split(String del)
 *     
 *     공백문자 제거 => 유효성 검사
 *     String trim() => 좌우 공백 제거
 *     
 *     문자열 결합
 *     String concat(String s) *** 사용빈도가 거의 없다
 *     => '+' 연산자가 있기 때문에 
 *     - "ABC" + "DEF" ==> 오라클
 *     - "ABC".concat("DEF") ==> MySQL
 *     
 *  3. 변경
 *     replace(char c1, char c2)
 *     replace(String s1, String s2)
 *     
 *     String ss="Hello Java";
 *     ss.replace('a','b')
 *       => Hello Jbvb
 *     ss.replace("Java", "Oracle")
 *       => Hello Oracle
 *       
 *     String replaceAll(대상문자/문자열,문자열)
 *       => 정규식 [가-힣] [A-Z] ... 
 *     
 *  4. 찾기 
 *     char charAt(int index) => 문자 한개 추출
 *     
 *     "Hello Java"
 *      0123456789 => charAt(7) => 'a'
 *      
 *     int indexOf(char)
 *     int lastIndexOf(char)
 *     
 *     indexOf('l') => 2 => 크롤링
 *     lastIndexOf('l) => 3 => 경로명 / URL, 확장자
 *     
 *  5. 비교
 *     boolean equals(String s)
 *      => 대소문자 구분 
 *      ex) 로그인, 아이디 중복체크
 *     boolean equalsIgnoreCase(String s)
 *      => 대소문자 구분 x 
 *      ex) 검색
 *     boolean startsWith(String s)
 *      => 시작 문자열이 같은지 확인 : 대소문자 구분 
 *      ex) 자동완성기
 *      	=> 쿠키 저장 => 시작 문자열이 같은 경우
 *     boolean endsWith(String s)
 *      => 끝나는 문자열이 같은지 확인 : 대소문자 구분
 *      ex) url 경로 확인
 *      
 *     compareTo(String s)
 *     "Hello".compareTo("Java") => +2
 *     "Hello".compareTo("Hello") => 0
 *     "Java".compareTo("Hello") => -2
*/

import java.util.Arrays;

public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'a','B','c','d','E','K'};
		// 대문자 출력
		for(char c:ch) {
			if(c>='a' && c<='z')
				c=(char)(c-32);
			System.out.print(c+" ");
		}
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
			System.out.print(ch[i]+" ");
		}
		// 인덱스가 존재 => 데이터값을 변경
		// for-each => 값을 받는 변수만 이용해서 출력
		
		// 정해져있는 메서드를 사용하기 편해서 String을 자주 사용한다
		String s="a B c d E K";
		System.out.println("\n"+s.toUpperCase());
		/*
		 *  ----------------- 편하게 사용하기 위해 만들어진 것
		 *  char[] => String
		 *  int => Integer
		 *  long => Long 
		 *  ----------------- Wrapper 클래스(참조형)
		*/
		
		// 문자열은 자체가 메모리 주소
		// 같은 문자열은 같은 주소를 가지고 있다
		
		System.out.println("===== 메모리 주소 비교 =====");
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		if(s1==s3)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		/*
		 *  arr : 주소 저장 => 1 2 3 4 5 
		*/
		int[] arr2=arr;
		System.out.println(Arrays.toString(arr2));
		
		// 주소가 같기 때문에 arr2를 변경해도 arr도 같이 변경된다
		arr2[0]=100;
		arr2[1]=200;
		System.out.println(Arrays.toString(arr));
		
		int[] arr3=arr.clone();
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3); // clone을 하면 주소값이 달라진다 => '깊은 복사'
		
		System.out.println("===== Compare ====="); // 맨 앞 자리만 비교, 왼쪽-오른쪽
		String s11="Hello";
		String s22="Java";
		int res=s11.compareTo(s22);
		System.out.println(res);
		int res1=s22.compareTo(s11);
		System.out.println(res1);
		int res3=s22.compareTo(s22);
		System.out.println(res3);
		
		int aa=100;
		int bb=200;
		int tt=aa; // 값을 변환할 때는 반드시 임시변수 선언
		aa=bb;
		bb=tt;
		System.out.println(aa+"|"+bb);
	}
	

}
