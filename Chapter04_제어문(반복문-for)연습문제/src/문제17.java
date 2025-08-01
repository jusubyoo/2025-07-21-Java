/*
 *  A B C D E
 *  A B C D E
 *  A B C D E
 *  A B C D E
 *  A B C D E
 */
public class 문제17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c='A';
		for(int i=1;i<=5;i++)
		{
			for(char j=1;j<=5;j++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
			c++;
		}
	}

}
