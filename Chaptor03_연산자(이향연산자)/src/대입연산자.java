/*
 * 	대입연산자
 * 	복합대입연산자
 * 	= : 값을 대입할 때 (초기값, 결과값)
 *  += : int a=10;
 *  	 a+=10;
 *  	 => a=a+10; => 20(증가)
 *  -= 
 *  ---------------------------
 *  *=
 *  /=
 *  %=
*/
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		a++;
		++a;
		++a;
		a++;
		a++;
		System.out.println("a="+a);
		
		a=1;
		a+=5;
		System.out.println("a="+a);
		
		String s1="Hello ";
		String s2="Java";
		String s3="!!";
		String s4=s1;
		 s4+=s2;
		 s4+=s3;
		 System.out.println(s4);
		 // =, += ==> 숫자, 문자열 
		 // -= ==> 숫자
	}

}
