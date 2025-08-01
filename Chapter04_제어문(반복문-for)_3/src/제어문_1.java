/*
 *  이차 for문 => 형식, 동작순서
 *  
 *  형식)
 *  for(초기값;조건식;증감식)
 *  {
 *  	for(초기값;조건식;증감식)
 *  	{
 *  	
 *  	}
 *  }
*/
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== 구구단 =====");
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%d * %d = %d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
