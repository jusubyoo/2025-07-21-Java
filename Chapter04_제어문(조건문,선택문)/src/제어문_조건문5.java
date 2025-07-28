/*
 *  국어 영어 수학 점수 입력
 *  평균 출력, 총점 출력, 학점 출력
 *  
 *  100~97 : A+
 *  96~94 : A0
 *  93~90 : A-
 *  
 *  80~83 : B-
 *  84~86 : B0
 *  87~89 : B+
 *  
 *  50점대 : F
 */
import java.util.*;
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("국어 영어 수학 입력(90 90 90): ");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.println("평균: "+avg);
		System.out.println("총점: "+total);
		int temp=(total/3)/10;
		if(temp==10 || temp==9)
			System.out.println("학점: A");
		if(temp==8)
			System.out.println("학점: B");
		if(temp==7)
			System.out.println("학점: C");
		if(temp==6)
			System.out.println("학점: D");
		if(temp<6)
			System.out.println("학점: F");
	}

}
