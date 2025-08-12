/*
 *  인덱스 : 0번부터 => 값 지정 위치 구분
 *  	   ----- 반복문 사용이 편리
 *  => 반복문
 *     - 데이터값 초기화, 값 변경시 사용 : 일반 for문
 *     - 출력만 처리 : for-each
 *     			    -------- 웹 데이터를 브라우저에 출력할 때
 *       map => js(for-each)
*/
// 초기화 => 입력, 임의 추출 => 중요한 것 : 저장을 몇개 할지 (for-each)
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 초기화 (임의 추출)
		int[] arr=new int[10];
		int max=1;
		int min=100;
		
		for(int i=0;i<arr.length;i++) // ***갯수보다 인덱스가 1개 작다 / <= 금지 
		{
			arr[i]=(int)(Math.random()*100)+1;
			//System.out.print(arr[i]+" ");
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("\n===== 결과 =====");
		for(int i:arr) // 출력 형식
		{
			// i는 인덱스번호가 아니라 실제 저장된 값을 읽을 때 사용
			// 데이터가 없는 경우에 자동으로 종료
			System.out.print(i+" ");
		}
		System.out.println("\n최대값: "+max);
		System.out.println("최소값: "+min);
	}

}
