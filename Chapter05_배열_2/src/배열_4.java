import java.util.Arrays;
/*
 *     31, 33, 73, 36, 4
 *     --  --
 *     31  33
 *     --     --
 *     31     73
 *     --         --
 *     31         36
 *     --             --
 *     4 			  31
 *     ------------------ -----> for1 (1round)
 *     4, 33, 73, 36, 31
 *        --  --
 *        33  74
 *        --      --
 *        33      36
 *        --          --
 *        31          33
 *    ------------------- -----> for2 (2round)
 *    4   31  74  36  33
 *            --  --
 *            36  73
 *            --      --
 *            33      36
 *    ------------------- 
 *    4   31  33  73  36  -----> for3 (3round)
 *                --  --
 *                36  73
 *    -------------------
 *    4   31  33  36  73  -----> for4 (4round)
*/

// select sort
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] com=new int[5];
		
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*100)+1;
		}
		System.out.print("===== 정렬 전: ");
		for(int i:com) {
			System.out.print(i+" ");
		}
		System.out.print("\n===== 올림차순: ");
		for(int i=0;i<com.length-1;i++) {
			for(int j=i;j<com.length;j++) {
				if(com[i]>com[j]) {
				int temp=com[i];
				com[i]=com[j];
				com[j]=temp; }
			}
		}
		for(int i:com) {
			System.out.print(i+" ");
		}
		System.out.print("\n===== 내림차순: ");
		for(int i=0;i<com.length-1;i++) {
			for(int j=i;j<com.length;j++) {
				if(com[i]<com[j]) { // 이 부분만 차이
				int temp=com[i];
				com[i]=com[j];
				com[j]=temp; }
			}
		}
		
		for(int i:com) {
			System.out.print(i+" ");	
		}
		
		System.out.print("\n===== Array.sort 내림차순: ");
		Arrays.sort(com);
		for(int i=com.length-1;i>=0;i--)
		{
			System.out.print(com[i]+" ");
		}
		
		
	}

}
