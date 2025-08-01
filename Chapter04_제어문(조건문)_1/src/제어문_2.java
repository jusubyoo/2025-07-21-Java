// 국어, 영어, 수학 점수 입력받기 => 총점, 평균 => 60점 이상이면 합격 미만이면 불합격
import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어: ");
		int kor=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		System.out.print("영어: ");
		int eng=scan1.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.print("수학: ");
		int math=scan2.nextInt();
		
		int total=kor+eng+math;
		double avg=(kor+eng+math)/3.0;
		
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n",avg);
		
		if(avg>=60)
			System.out.println(avg+"점 합격입니다");
		else
			System.out.println(avg+"점 불합격입니다");
		
		
	}

}
