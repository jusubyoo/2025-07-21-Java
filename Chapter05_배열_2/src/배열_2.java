
/*
 *  배열 특징
 *  1) 같은 데이터형끼리만 모아서 관리 -> 관련된 데이터만(같은 종류)
 *     뮤직 : 노래명 / 가수 / 앨범 / 등폭 / 동영상 키
 *         String String String int  Sring => 배열 5개 필요
 *  
 *  2) 한번 생성하면 배열의 크기를 줄이거나 늘릴 수 없다
 *     => 고정적이라 삭제, 추가가 불가능(실무에서 배열은 잘 안쓰인다)
 *     => 대신 가변적인 *** 컬렉션 사용(클래스화)
 *  3) 반드시 초기화
 *     - 배열 선언 : 데이터를 모아서 관리
 *     - 초기값 
 *       - 선언과 동시에 초기화
 *         int[] arr={1,2,3,4,5};
 *         
 *       - 임시로 기본값 저장
 *         int[] arr=new int[5];
 *         
 *       - 배열마다 데이터를 추가
 *         int[] arr;
 *         arr=new int[4];
 *         ---------
 *         arr[0]=1
 *         arr[1]=2
 *         arr[2]=3
 *         arr[3]=4
 *         --------- => 일반 for 문
 *         
 *  4) 출력
 *     for(int i=0;i<5;i++)
 *     {
 *       => 배열의 인덱스를 이용한 출력
 *       arr[i]
 *     }
 *     
 *     for(받는 변수:배열명)
 *     {   ------- 배열에 저장 실제 데이터 읽기
 *     
 *     }
 *     
 *     System.out.println(Arrays.toString(배열명))
 *     
 *     
*/

import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println("===== 일반 for =====");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("===== for-each =====");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("===== toString =====");
		System.out.print(Arrays.toString(arr));
		// 데이터가 잘 들어갔는지 확인하는 용도
	}
	// 같은 종류의 데이터가 3 이상이면 => 배열 
	// 다른 종류의 데이터가 여러개 있으면 => 클래스 : 상세보기

}
