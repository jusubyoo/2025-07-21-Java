// 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum2=0;
		int sum3=0;
		
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
			{
				sum2+=i;
			}
			if(i%3==0)
			{
				sum3+=i;
			}
		}
		System.out.println("0~12까지의 2의 배수의 합: "+sum2);
		System.out.println("0~12까지의 3의 배수의 합: "+sum3);
	}

}
