// 알파벳 출력 => ABC~XYZ
/*
 *  반복문
 *  - for : 반복 횟수가 지정된 경우
 *  - while : 반복 횟수가 없는 경우
 *  	=> 선조건
 *  - do~while : 무조건 한번 이상은 수행
 *  	=> 후조건
 *  	do
 *  	{
 *  	   반복문장
 *  	} while(조건)
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=2;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		
		//---------------------------- 무한루프
		for(int i=1;i==1;)
		{
			System.err.println("경고");
		}
		
		for(;;)
		{
			System.err.println("경고");
		}
	}

}
