/*
 *  1. 데이터 저장
 *     = 변수 : 한개만 저장 가능
 *     = 배열 : 같은 종류의 데이터를 여러개 저장 가능
 *     = 클래스 : 관련된 다른 데이터형을 모아서 저장
 *       => ~VO => FoodVO, ~DAO => 오라클
 *       
 *  2. 배열 할당 => 메모리에 저장
 *     데이터형[] 배열명 = new 데이터형[저장갯수]
 *     
 *  3. 배열값 초기화
 *     - 기본값 지정 => 나중에 값 변경
 *      int => 0 / long => 0L / String => null / boolean => false
 *     - 선언과 동시에 값을 설정
 *      int[] arr={1,2,3,4,5}
 *     - File에서 읽어서 초기화
 *     - DataBase에서 읽어서 초기화
 *     - 크롤링을 통해서 초기화
 *     
 *  4. 배열 : 인덱스를 이용해서 데이터를 한개씩 제어한다
 *     - 0번부터 시작한다
 *     - 갯수 : length 를 이용해서 찾는다
 *     - 같은 종류의 데이터가 3개 이상일 때 사용   
*/

// 3명의 국어 점수 => 총점 평균 등수 구하기
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10개의 정수를 저장
		Scanner scan=new Scanner(System.in);
		int[] kor=new int[3];
		int[] rank=new int[3];
		
		// 필요한 데이터를 저장한다
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"' 국어 점수 입력: ");
			kor[i]=scan.nextInt();
		}
		// 등수
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1; // 1등을 설정하고
			for(int j=0;j<kor.length;j++)
			{
				if(kor[i]<kor[j])
				{
					rank[i]++; // 비교해서 작으면 +1씩 등수를 올린다
				}
			}
		}
		System.out.println("===== 결과값 =====");
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d\n",kor[i],rank[i]);
		}
	}

}
