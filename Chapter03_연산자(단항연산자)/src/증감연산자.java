/*
 *  증감연산자 => 제어문(반복문)
 *  				   |
 *  			  총알 발사 게임
 *  			 비행기 자동 이동
 *   ++ : 1증가 
 *   -- : 1감소
 *   
 *   1) 전치 연산자
 *   	++a : 1증가
 *   	-- 먼저 증가하고 다른 연산 수행
 *   2) 후치 연산자
 *      a++ : 1증가
 *       -- 다른 연산 먼저 수행 후 증가
 *       
 *   ex) int a=10;
 *   	 int b=++a;
 *   	 
 *   	 a=11, b=11
 *   
 *   	int a=10;
 *   	int b=a++;
 *   		--- 1
 *   		   -- 2
 *   
 *   	 a=11, b=10
 *   
 *    	int a=10;
 *    	int b=++a + ++a;
 *    
 *    	 a=12, b=23
 *    
 *    	int a=10;
 *    	int b=a++ + a++;
 *    	
 *    	 a=12, b=21
 *    
 *    	int a=10;
 *    	int b=++a + a++;
 *    	
 *    	 a=12, b=22
 *    
 *     	int a=10;
 *      int b=++a + a++ + ++a + a++;
 *      	   11   11     13    13
 *       a=14, b=48
 *       
 *      int a=10;
 *      int b=a++ + a++ + ++a + a++;
 *             10    11    13    13
 *       a=14, b=47
 *       
 *      ------------------------------
 *      int a=10;
 *      int b=a++ + --a + a-- + a++;
 *      	   10    10    10    9     
 *       a=10, b=39
 *       
 *      int a=10;
 *      int b=a-- + a-- + --a + --a;
 *      	   10    9     7     6
 *       a=6, b=32
*/
public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		// ++ => a=a+1 
//		System.out.println("a="+a+",b="+b);
//		
//		a=10;
//		b=a++;
//		System.out.println("a="+a+",b="+b);
//		
//		a=10;
//		b=++a + ++a;
//		System.out.println("a="+a+",b="+b);
//		
//		a=10;
//		b=a++ + a++;
//		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=--a;
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=a--;
		System.out.println("a="+a+",b="+b);
		
		a=10;
		a++;
		a--;
		--a;
		++a;
		a++;
		System.out.println(a);
		
		a++;
		a++;
		a--;
		System.out.println("a="+a);
		/*
		 *	double d=123456.78;
		 *	int i=123456;
		 *	int a=(int)((d-i)*100); 
		*/
		
		double d=123456.78;
		int i=123456;
		int a1=(int)((d-i)*100);
		System.out.println(a1);
		
		// char는 연산이 수행되면 자동으로 int로 변경
		char c='A';
		char c1=c++;
		System.out.println(c);
		System.out.println(c1);
	}
	/*
	 *	++, -- => 무조건 1개증가/1개감소
	 *	int a=10;
	 *	int b=a ++;
	 *		--- --
	 *			2) a에 1을 증가
	 *		1) b에 a값 대입
	 *
	 * 	int a=10;
	 * 	int b = ++a;
	 * 		    --
	 * 		    1) a에 1을 증가
	 * 	    ------
	 * 		2) b에 증가된 a값 대입
	*/

}
