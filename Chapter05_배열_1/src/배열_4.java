// 문자 저장
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[15];
		int cnt=0;
		int cnt1=0;
		
		// 변수의 위치
		for(int i=0;i<alpha.length;i++) {
			int a=(int)(Math.random()*2);
			if(a==0)
				alpha[i]=(char)((Math.random()*26)+65);
			else
				alpha[i]=(char)((Math.random()*26)+97);
			
			System.out.print(alpha[i]+" ");
			
			if(alpha[i]>='A' && alpha[i]<='Z')
				cnt++;
			else
				cnt1++;
		}
		System.out.println("\n대문자 갯수: "+cnt+"개");
		System.out.println("소문자 갯수: "+cnt1+"개");
	}

}
