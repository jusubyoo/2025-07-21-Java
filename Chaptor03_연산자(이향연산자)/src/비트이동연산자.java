/*
 * 	x<<y == x*2^y
 * 	4<<2 == 16 => 0을 두개 붙인다
 * 
 * 	x>>y == x/2^y
 * 	4>>2 == 1 => 0을 두개 제거한다
 * 
 * 	4 = 100(2) 4<<2 => 10000(2) = 16
 * 			   4>>2 => 1(2) = 1
 * 16 8 4 2 1
 *  1 1 0 1 1 => 11011(2)
 *  27<<2 => 1101100(2) => 64+32+8+4=108
 *  27>>2 => 110(2) => 4+2=6
 *  
 *  
*/
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27));
		System.out.println(27<<2);
		System.out.println(27>>2);
	}

}
