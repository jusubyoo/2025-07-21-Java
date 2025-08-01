/*
 * 웹 개발
 * ------
 * 연산자 => 오라클/자바스크립트
 * 	1. 산술연산자
 * 	2. 비교연산자
 * 	3. 증감연산자
 * 	4. 형변환연산자
 * 	5. 논리연산자
 * 	6. 부정연산자
 * 	7. 대입연산자
 * 	-----------
 * 
 * 자바 => JPS / SpringFramework / Spring-Boot
 * 		  ----------------------------------- 웹 라이브러리
 * 자바스크립트 => VueJS / ReactJS / NextJS
 * 오라클 => mySQl / MariaDB
 * ------------------ CI/CD => 리눅스 명령어
 * 
 * ------------------------------------------
 * 비교연산자 : 결과값 true/false
 * 			  
 * 	1. == 
 *  2. != 
 *  3. <, >
 *  4. <=, => : 둘 중 하나만 true면 true가 된다
 *     사용처 : 조건문/반복문
 *     		  if(비교연산자|논리연산자|부정연산자)
 *     			 ------------------------ true/false
 *     
 *     		  while(비교연산자|논리연산자|부정연산자)
 *     		  {
 *     		  } 
*/
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=10;
		boolean result1=(num1==num2); // true
		boolean result2=(num1!=num2); // false
		boolean result3=(num1<=num2);
		
		char c1='A';
		char c2='B';
		boolean result4=(c1<c2); //true
		// char 데이터형은 모든 연산이 수행되면 정수로 변환
		double f=10.5;
		double d=10.5;
		boolean result5=(f==d); // false
//		System.out.println(result5);
		
		boolean b1=true;
		boolean b2=false;
		boolean result6=(b1==b2); // true
		boolean result7=(b1!=b2); // false
		
		String s1=new String("Hello");
		String s2="Hello";
		String s3="Hello";
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		boolean result8=(s1==s2);
		boolean result9=(s1!=s2);
		boolean result10=(s2==s3);
		boolean result11=(s2!=s3);
		boolean result12=(s1.equals(s2));
		
//		System.out.println("result1:"+result1);
//		System.out.println("result2:"+result2);
//		System.out.println("result3:"+result3);
//		System.out.println("result4:"+result4);
//		System.out.println("result5:"+result5);
//		System.out.println("result6:"+result6);
//		System.out.println("result7:"+result7);
//		System.out.println("result8:"+result8);
//		System.out.println("result9:"+result9);
//		System.out.println("result10:"+result10);
//		System.out.println("result11:"+result11);
//		System.out.println("result12:"+result12);
//		
		String ss1="Hello";
		String ss2="hello";
		
		boolean result13=(ss1.equals(ss2));
		// 대소문자 구분해서 비교 => 로그인처리, id찾기, 비밀번호찾기, id중복체크
		boolean result14=(!ss1.equals(ss2));
		boolean result15=(ss1.equalsIgnoreCase(ss2));
		// 대소문자 구분하지 않고 비교
		System.out.println("result13:"+result13);
		System.out.println("result14:"+result14);
		System.out.println("result15:"+result15);
		// 문자열은 자체 라이브러리 이용
		/*
		 * 	String : 클래스 (기능=>메소드) => 표준화 가능
		 *	contains() : 단어포함한 검색
		 *	--------------
		 *	startsWith() : 시작문자열이 같을 때
		 *	endsWith() : 파일 확장자 .jpg
		 *	-------------- 서제스트
		 *
		 *	
		*/
	}

}
