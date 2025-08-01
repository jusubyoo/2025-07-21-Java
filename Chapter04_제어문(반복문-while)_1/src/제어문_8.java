/*
 *  int i=1;
 *  while(i<=5)
 *  {
 *  	실행문장
 *  	i++;
 *  }
 *  				
 *  i=1 => i<=5 => 실행문장 => i++
 *  
 *  
*/
public class 제어문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지의 합
		int sum=0; // 누적 변수
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		}
		System.out.println("for=>sum="+sum);
		
		int i=1;
		sum=0;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("while=>sum="+sum);
		
		i=1;
		sum=0;
		do {
			sum+=i;
			i++;
		} while(i<=100);
		System.out.println("do~while=>sum="+sum);
	}

}
