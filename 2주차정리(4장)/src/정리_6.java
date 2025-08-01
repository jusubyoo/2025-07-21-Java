/*
 *  반복문 :
 *  	for => 목록 출력, 크롤링, 페이징
 *  		   => 반복횟수 지정
 *  	while => 데이터베이스 연동
 *  		     => 반복횟수가 없는 경우에 주료 사용 : 무한루프
 *  	검색 / 로그인 / 회원 관련 => if / if~else
 *  	메뉴 / 버튼 ==> 다중 조건문 / switch
 *  	-------- 웹 : 화면 이동 => <a href="">
 *  	*** 일차 for문, 일차 while문 ***
 *  	----------------------------
 *    	초기값
 *  	while(조건식)
 *  	{
 *  	  반복문장
 *  	  증감식
 *  	}
 *  	if, if~else, for, while, break => 공통기반으로 주로 웹에서 등장
 *  	
 *  	=> 명령프롬프트 : continue
 *  	=> 윈도우 : 다중조건문/switch
 *  
 *  	=> 변수의 위치 => 지역변수 (메모리 삭제 후 다시 생성)
 *  	
*/			
public class 정리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			int a=100;
			System.out.println(a);
			a+=100; // a+=100이 a값을 계속 100으로 초기화시킨다
			
			
		}
	}

}
