// 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=0;
		
		for(int i=1;i<=10;i+=2)
		{
			a+=i;
		}
		for(int i=0;i<=10;i+=2)
		{
			b+=i;
		}
		System.out.println("1-2+3...-10까지의 합:"+(a-b));
	}

}
