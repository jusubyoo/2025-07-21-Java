// 암호화 => encoding => decoding(도크화)
// 시저스암호화(3칸 이동) -> ABC => DEF

import java.net.*;

public class 메소드_5 {
	static String encoder(String s) throws Exception // 에러 회피
	{
		return URLEncoder.encode(s, "UTF-8");
	}
	static String decoder(String s) throws Exception // 에러 회피
	{
		return URLDecoder.decode(s, "UTF-8");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s="자바";
		String encoding=URLEncoder.encode(s, "UTF-8"); // 암호화
		System.out.println(encoding);
		String decoding=URLDecoder.decode(s, "UTF-8"); // 암호화 해제
		System.out.println(decoding);
//		int a=10;
//		int b=0;
//		try {
//		System.out.println(a/b);
//		}catch(Exception e) {} // try~catch : 오류나면 무시하고 다음 문장 진행 => 에러 복구
//		System.out.println("프로그램 종료");
	}

}
