/*
 *  1. 알파벳을 입력 받아 (단일 조건문)
 *  	- 대문자
 *  	- 소문자
 *  	- 알파벳이 아니다
 */
import java.security.DrbgParameters.NextBytes;
import java.util.*;
public class 제어문_조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳을 입력하시오: ");
		
		String temp=scan.next();
		char c=temp.charAt(0);
		
		if(c>='A' && c<='Z')
			System.out.println("대문자입니다");
		if(c>='a' && c<='z')
			System.out.println("소문자입니다");
		if(!((c>='A' && c<='Z') || (c>='a' && c<='z')))
			System.out.println("알파벳이 아닙니다");
	}

}
