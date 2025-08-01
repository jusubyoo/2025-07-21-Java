// 3개 점수 입력 받고 학점, 총점, 평균 구하기
// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
// switch 사용
import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("수학: ");
		int math=scan.nextInt();
		System.out.print("영어: ");
		int eng=scan.nextInt();
		System.out.print("국어: ");
		int kor=scan.nextInt();
		
		int total=math+eng+kor;
		int avg=total/3;
		
		char score='A';
		switch(avg/10)
		{
		case 10,9 -> {
			score='A';
		}
		case 8 -> {
			score='B';
		}
		case 7 -> {
			score='C';
		}
		case 6 -> {
			score='D';
		}
		default -> {
			score='F';
		}
		}
		
		System.out.println("학점: "+score);
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
	}

}
