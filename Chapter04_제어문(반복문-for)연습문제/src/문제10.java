// 1~100까지의 정수 중 4의 배수의 합계를 구하라
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=0;i<=100;i+=4)
		{
			sum+=i;
		}
		System.out.println("1~100까지의 정수 중 4의 배수의 합계는 "+sum+"입니다");
	}

}
