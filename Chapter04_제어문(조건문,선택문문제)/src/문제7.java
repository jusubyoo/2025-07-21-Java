// 3개 점수 입력 받고 학점, 총점, 평균 구하기
// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("수학: ");
		int math=scan.nextInt();
		System.out.print("영어: ");
		int eng=scan.nextInt();
		System.out.print("국어: ");
		int kor=scan.nextInt();
		
		int total=math+kor+eng;
		double avg=total/3.0;
		
		if(avg>=90)
			System.out.println("학점 : A");
		else if(avg>=80)
			System.out.println("학점 : B");
		else if(avg>=70)
			System.out.println("학점 : C");
		else if(avg>=60)
			System.out.println("학점 : D");
		else
			System.out.println("학점 : F");
		
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n",avg);
	}

}
