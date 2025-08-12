// 10개의 임의의 정수를 저장 => 총합 / 평균 구하기
// 전체 데이터 => for, 요청값 추출 => if 사용
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
		}
		int sum=0;
		
		for(int i:arr) { // for-each문 : 실제 배열에 저장된 값을 순차적으로 읽는다
			sum+=i;
		}
		System.out.println("\n총합: "+sum);
		System.out.printf("평균: %.2f\n",sum/10.0);
	}

}
