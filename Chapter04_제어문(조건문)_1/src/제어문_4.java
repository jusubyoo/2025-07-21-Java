// 입력을 받아서 로그인 처리
// id, pwd 받기 => 오라클에서 처리
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의로 ID,PW 설정
		final String ID="admin";
		final String PW="Qwer1234!";
		// final : 상수
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		
		System.out.print("비밀번호 입력:");
		String pw=scan.next();
		
		/*
		 *  scan.nextInt() : 정수
		 *  scan.nextDouble() : 실수
		 *  scan.nextBoolean() : true/false
		 *  scan.next(), scan.nextLine() : 문자열
		 */
		System.out.println("===== 결과 =====");
		if(id.equals(ID) && pw.equals(PW))
			System.out.println("로그인 성공");
		else
			System.out.println("아이디나 비밀번호가 틀립니다");
	}

}
