// => 1~100의 정수 중 3의 배수, 5의 배수, 7의 배수의 합을 출력하고
// 가장 큰 배수와 가장 작은 배수를 각각 하나씩 구해라
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;
		int i=1; // 루프 변수
		while(i<=100)
		{
			if(i%3==0)
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;
			
			i++;
		}
		System.out.println("1~100까지 3의 배수의 합: "+a3);
		System.out.println("1~100까지 5의 배수의 합: "+a5);
		System.out.println("1~100까지 7의 배수의 합: "+a7);
		
		int max=a3;
		int min=a3;
		
		if(max<a5)
			max=a5;
		if(max<a7)
			max=a7;
		
		if(min>a5)
			min=a5;
		if(min>a7)
			min=a7;
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}

}
