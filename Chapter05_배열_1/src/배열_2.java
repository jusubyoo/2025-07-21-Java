// 10개의 임의의 정수를 10개 받아서 최대값, 최소값 구하기

public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int max=0;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
			
			// 최대값이 있는 위치의 인덱스 번호 구하기
			if(max<arr[i])
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.println("\n최대값 "+max+"는(은) "+(index+1)+"번째에 있습니다.");
		
		// 5번째와 6번째의 값을 출력하고 차이가 얼마인지 확인하기
		System.out.printf("%d - %d = %d\n",arr[4],arr[5],arr[4]-arr[5]);
	}

}
