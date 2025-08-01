// 임의의 문자를 추출하여 소문자인지 확인하는 프로그램
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*2);
		// a = 0, 1
		
		char c=' ';
		if(a==0)
		{
			c=(char)((Math.random()*26)+97);
		}
		else
			c=(char)((Math.random()*26)+65);
		
		if(c>='a' && c<='z')
			System.out.println(c+"은(는) 소문자입니다");
		else
			System.out.println(c+"은(는) 대문자입니다");
	}

}
