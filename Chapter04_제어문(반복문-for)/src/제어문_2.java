/*
 *  어디서부터; 어디까지; 반복횟수(증가/감소)
 *  	  1    2	4
 *  for(초기값;조건식;증감식)
 *  {
 *  	반복수행문장 3
 *  }
 *  
 *  1-2-3-4
 *    2-3-4
 *    2-3-4
 *    -----> 2의 조건식 false면 종료
 *    
 *  => 반복 횟수가 있다
 *  => Front-End : for => Back-End : while
 *  			   ---
 *  				| 2차 for문 => 알고리즘
 *  
 *  => 1~100 까지의 합, 짝수의 합, 홀수의 합 구하기
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, even=0, odd=0;
		// 합의 초기값은 0부터 시작, 곱셈의 초기값은 1부터 시작
		
		for(int i=1;i<=100;i++)
		{
			sum+=i; // sum=sum+i
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("총합: "+sum);
		System.out.println("짝수의 합: "+even);
		System.out.println("홀수의 합: "+odd);
		System.out.println("================");
		// 3의 배수의 합, 5의 배수의 합, 7의 배수의 합
		int a=0, b=0, c=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				a+=i;
			if(i%5==0)
				b+=i;
			if(i%7==0)
				c+=i;
		} 
		
		System.out.println("3의 배수의 합: "+a);
		System.out.println("5의 배수의 합: "+b);
		System.out.println("7의 배수의 합: "+c);
	}
	
}
