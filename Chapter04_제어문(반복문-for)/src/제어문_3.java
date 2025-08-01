// 변수의 사용범위 => 지역변수 : 메모리 자체에서 생성/소멸
// {} 안에서만 사용 가능
// 지역변수 단점 : 다른 클래스에서 사용 불가능
/*
 * {
 *   int a=10;
 *   {
 *     int b=10;
 *     {
 *       int c=10;  
 *     }  => a,b,c
 *   }  => a,b
 * }  => a
 * {} 밖에는 a,b,c 어떠한 변수도 없다
 */
public class 제어문_3 {
	// 다른 클래스에서 사용이 가능한 영역
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		
		// i는 루프변수지만 사용 금지 권장 => m/n, a/b 등으로 대체 (i,j 구분 어려움)
		for(int i=0;i<26;i++)
		{
			System.out.print(c++);
		}
	}

}
