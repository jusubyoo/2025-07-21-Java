// 세개의 정수를 입력받고
// 최대값, 최소값, 합계, 평균 구하기
import java.util.Scanner;
public class 문제4 {
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫번째 정수를 입력하시오: ");
//		int num1=scan.nextInt();
//		System.out.print("두번째 정수를 입력하시오: ");
//		int num2=scan.nextInt();
//		System.out.print("세번째 정수를 입력하시오: ");
//		int num3=scan.nextInt();
//		
//		// 최대값은 초기값 1, 최소값은 초기값 100
//		int max=num1;
//		if(max<num2)
//		{
//			max=num2;
//		}
//		if(max<num3)
//		{
//			max=num3;
//		}
//		System.out.println("최대값: "+max);
//		
//		int min=num1;
//		if(min>num2)
//		{
//			min=num2;
//		}
//		if(min>num3)
//		{
//			min=num3;
//		}
//		System.out.println("최소값: "+min);
//		
//		int total=num1+num2+num3;
//		double avg=total/3.0;
//		
//		System.out.println("합계: "+total);
//		System.out.printf("평균: "+avg);
		
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.println(a+","+b+","+c);
		
		System.out.printf("합계: %d\n",a+b+c);
		System.out.printf("평균: %.2f\n",(a+b+c)/3.0);
		
		int max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}
}
