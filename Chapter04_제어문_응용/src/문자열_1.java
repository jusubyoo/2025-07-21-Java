/*
 *  문자열
 *  ---- 자바
 *  String => 데이터형 / 클래스형 (기능=>메소드)
 *  => 사용법
 *     String 변수명="문자"
 *     				--- 제한이 없다
 *     ex) 회원 정보 저장
 *     
 *     변환
 *      - toUpperCase() : 대문자 변환
 *      - toLowerCase() : 소문자 변환
 *      ------------------------ 웬만하면 한글을 쓰기 때문에 사용빈도가 적다
 *      - valueOf() : 모든 데이터형을 문자열로 변환 => 가장 많이 쓰인다
 *      - 웹/인도우 => 모든 데이터형 String
 *      - valueOf(10) => "10"
 *      
 *     비교
 *      - equals() => 실제 문자열 비교
 *      - contains() => 포함 문자열 
 *      - startsWith() => 시작 문자열
 *      - endsWith() => 끝 문자열
 *      
 *     검색
 *      ex) Hello Java!!
 *          0123456789
 *      - int indexOf("a") : 7
 *        int indexOf("Java") : 6
 *      => 앞에서부터 찾아줌
 *      - int lastIndexOf("a") : 9
 *      => 뒤에서부터 찾아줌
 *      
 *     제어
 *      - subString() : 문자열 자르기
 *      - split() : 문자별로 자르기
 *      - trim() : 공백문자 제거
 *     
 *     
*/
// substring
import java.io.*; // io : input/output => 파일 입출력
import java.util.*;
public class 문자열_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String msg="Hello Java";	
		// 1. 문자의 갯수 => " " => 공백도 포함
		//    => legnth() -> int	
		int leng=msg.length();
		System.out.println("문자 갯수: "+leng);
		// 2. 자르기
		String s=msg.substring(6);
		System.out.println(s);
		s=msg.substring(1, 5);
		// substring(beginIndex, endIndex)
		// 						 -------- endIndex-1
		System.out.println(s);
	
		String name="문자열_1.java";
		String ext=name.substring(name.indexOf(".")+1);
		System.out.println(ext);
		
//		File dir=new File("c:\\javaDev");
//		File[] lists=dir.listFiles();
//		// 현재 폴더 : ./   상위 폴더 : ../
//		for(File f:lists) // 향상된 for문 => 배열에서 사용
//		{
//			if(f.isFile()) // isDirectory => File=File+Directory
//			{
//				String ss=f.getName();
//				
//				System.out.println(ss.substring(ss.lastIndexOf(".")+1));
//			}
//			
//		}
		
		String msg1=" Hello Java!! ";
		System.out.println(msg1.length());
		
		String ss=msg1.trim(); 
		System.out.println(ss.length());
		// 공백문자 제거 => 좌우에 있는 공백만 제거(가운데는 x)
		// trim() => 로그인, 검색, 아이디 중복체크
		
		String msg2="Java Oracle HTML CSS JavaScript "
				+"JSP JQuery Ajax SpringFramework VueJS "
				+"SpringBoot Git GitAction Docker Docker-Compose "
				+"Jenkins React Next TypeScript MSA Chatting NodeJS";
		String[] datas=msg2.split(" ");
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력: ");
		String d=scan.next();
		for(String data:datas)
		{
			// System.out.println(data);
			// data.startsWith
			// data.endsWith
			// data.contains
			// data.equals
			// --------------- 대소문자 구분
			if(data.equalsIgnoreCase(d))
			{
				System.out.println(data);
			}
		}
	}

}
