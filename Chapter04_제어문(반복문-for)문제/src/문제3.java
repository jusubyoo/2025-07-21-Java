// 1부터 100까지 짝수의 합을 구하고 출력하라
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		
		System.out.println("2+4+...100의 합:"+sum);
	}

}
