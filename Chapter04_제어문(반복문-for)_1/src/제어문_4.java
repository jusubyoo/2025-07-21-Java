// index 번호 찾기 (몇번째에 있는지 찾기)
// 자바 : index 번호 => 0번부터 시작
// 오라클 : index 번호 => 1번부터 시작
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="AVLSNLKNLKSADBKC";
		System.out.println("문자의 총갯수: "+msg.length());
		
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 대문자입력: ");
		String s=scan.nextLine();
		
		int index=0;
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i); // 문자 받기
			if(c==s.charAt(0))
			{
				index=i;
				System.out.println(s+"은(는) "+(index+1)+"번째 위치한다");
			}
		}

	}

}
