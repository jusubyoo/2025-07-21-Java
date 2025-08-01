/*
 *  1. 조건문
 *     형식) 
 *     		if(조건문)
 *     		{  ----- true/false가 결과값인 연산자만 사용
 *     				 ---------- 
 *     				 부정, 비교, 논리 연산자
 *     		  조건이 true일때만 실행 => false면 건너뛴다
 *     		}
 *     		=> 사용 : 상세보기, 버튼클릭, 메뉴클릭
 *     				 로그인처리, 아이디찾기, 비밀번호찾기
 *     				 아이디 중복체크, 검색, 유효성 검사
 *     		- 선택 조건문 : true/false를 나눠서 작업
 *     		
 *    		- 다중 조건문 (사용빈도가 낮음) 
 *    		  => 선택문
 *    		  => DECODE / CASE
 *    		- 다중 조건문 vs Switch
 *    		  --------   
 *    		   범위지정  
 *    
 *    		-----------------------
 *    
 *    		2차 for문
 *    
 *    		for(int i=1;i<=3;i++)
 *    		{
 *    		  for(int j=1;j<=3;j++)
 *    		  {
 *    		    실행문장
 *    		  }
 *    		}
 *    
 *    - for문 응용
*/
import java.util.Calendar;
import java.util.Scanner;
public class 제어문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year=scan.nextInt();
		
		System.out.print("월 입력: ");
		int month=scan.nextInt();
		
		System.out.print("일 입력: ");
		int day=scan.nextInt();
		
		Calendar cal1=Calendar.getInstance();
		// 메모리 저장
		cal1.set(Calendar.YEAR, year);
		cal1.set(Calendar.MONTH, month-1);
		cal1.set(Calendar.DATE, day);
		
		int w=cal1.get(Calendar.DAY_OF_WEEK);
		String s="";
		switch(w)
		{
		case 1:
			s="일"; break;
		case 2:
			s="월"; break;
		case 3:
			s="화"; break;
		case 4:
			s="수"; break;
		case 5:
			s="목"; break;
		case 6:
			s="금"; break;
		case 7:
			s="토"; break;
		}
		
		System.out.printf("😕😕😕😕😕 %d년 %02d월 %02d일 %s요일 😕😕😕😕😕\n\n", 
				year,month,day,s);
		System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.print("토");
		System.out.println();
		
	
		Calendar cal=Calendar.getInstance();
		// 메모리 저장
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int week=cal.get(Calendar.DAY_OF_WEEK); // 요일
		week=week-1; // 1번부터 시작
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<=week;j++)
				{
					System.out.println("\t");
				}
			}
			/*
			 * if(i==day) System.err.printf("%02d\t",i); else
			 */
				System.out.printf("%02d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}

}
