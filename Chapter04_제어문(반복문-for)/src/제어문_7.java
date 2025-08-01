
public class 제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		int count=0;
		for(;;)
		{
			int user=(int)(Math.random()*100)+1;
			count++;
			if(com>user)
			{
				System.out.println("업");
			}
			else if(com<user)
			{
				System.out.println("다운");
			}
			else
			{
				System.err.println("정답입니다");
				System.out.println("입력횟수: "+count);
				break;
			}
		}
	}

}
