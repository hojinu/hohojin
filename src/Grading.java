import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력하시오 :");
		score = scn.nextInt();
		
		if(score >= 90)
		{
			System.out.println("학점 A");
		}
		else if(score >= 80)
		{
			System.out.println("학점 B");
		}
		else if(score >= 70)
		{
			System.out.println("학점 C");
		}
		else if(score >= 60)
		{
			System.out.println("학점 D");
		}
		else if(score >= 50)
		{
			System.out.print("학점 E");
		}
		else if(score >= 40)
		{
			System.out.print("학점 F");
		}
		
		System.out.print("입니다");
	}

}
