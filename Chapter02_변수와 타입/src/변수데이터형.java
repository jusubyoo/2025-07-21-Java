/*
 *	1. 변수 => 프로그램에 필요한 한개의 데이터를 저장하는 메모리 공간
 *     메모리는 주소(번지) => 주소에 대한 이름을 부여해서 사용
 *     211.249.220.24 => daum.net
 *     		  | 		    |
 *     		  ---------------
 *     				DNS
 *  2. 프로그램은 변수를 제어하는 것이다
 *  		   ---- 데이터
 *     데이터 관리
 *     --------
 *     	 한개 저장 => 같은 것 여러개 저장 => 다른 것 여러개 제어
 *     	   변수			  배열				 클래스
 *       ---------------------------------------------
 *                            |
 *                프로그램 종료시에 모든 데이터 소멸
 *                			  |
 *                     영구적인 저장 필요
 *                     --------------
 *                     파일의 단점 : 보안 => RDMS(관계형 데이터베이스) ex) 오라클, MySql
 *                     		       => 대용량이 아님 => NoSql 등장
 *                     			   => 몽고디비, ElasticSearch
 *  3. 자바에서 지원하는 메모리 크기 (데이터형)
 *  	 bit = byte = word = record
 *       0,1   8bit   문자열  file/table
 *       
 *       bit가 많으면 저장되는 숫자의 크기가 크다 => 64bit
 *       
 *     -정수형
 *     		byte 
 *     		int : 일반 숫자
 *     		long(8byte) => 64bit (-2^63+1~2^63)
 *     -실수형 : double : 8byte => 정밀도
 *     -문자형  
 *     	char : 2byte(0~65535)
 *     		   멀티바이트 (모든 문자를 숫자화) => Unicode
 *     		   하둡, 달빅머신, 클라우드, ...	
 *     -논리형 : boolean
 *     
 *     국어점수 영어점수 수학점수 평균 총점 학점 저장
 *     
 *     int kor
 *     int eng
 *     int math
 *     double avg
 *     int total
 *     char score
*/
public class 변수데이터형 {
	
	public static void main(String[] args) {
		/*int kor=100;
		int eng=100;
		int math=100;
		double avg=100.00;
		int total=300;
		char score='A';*/
		int kor=100,eng=100,math=100,total=300;
		double avg=100.00;
		char score='A';
		// String score="A+"
		boolean 재평가=false;
	}
}
