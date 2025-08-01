// 정수 한개 입력, 그 수가 50이상인지 미만인지 판단
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*100)+1;
		System.out.println("num="+num);
		if(num>=50)
			System.out.println(num+"은(는) 50이상입니다");
		else
			System.out.println(num+"은(는) 50미만입니다");
		
	}

}
