/*
 * 	& | ^ => 회로
 * 	
 * 		&(*)  |(+)	 ^
 * 00	 0	   0	 0
 * 01	 0	   1	 1
 * 10	 0     1	 1
 * 11	 1     1	 0
 * -------------------
 *   1100
 *   0101
 *   ----
 *   & : 0100 => 4
 *   | : 1101 => 13
 *   ^ : 1001 => 다른비트 찾기 (다르면1, 같으면0) => 9
 *  
 *   27 => 11011(2)
 *   13 => 01101(2)
 *   --------------
 *   & : 01001 => 9
 *   | : 11111 => 1+2+4+8+16=31
 *   ^ : 10110 => 22
 *   
 *   17 => 100011(2)
 *   17 => 010001(2)
 *   ---------------
 *   & : 000001 => 1
 *   | : 110011 => 1+2+16+32=51
 *   ^ : 110010 => 2+16+32=50
*/	
public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(35));
		System.out.println(Integer.toBinaryString(17));
		
		System.out.println(35&17);
		System.out.println(35|17);
		System.out.println(35^17);
	}

}
