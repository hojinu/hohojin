import java.util.Scanner;

public class Lager {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int x,y,max;
		
		System.out.print("첫번째 정수");
		x = scn.nextInt();
		System.out.println("두번째 정수");
		y = scn.nextInt();
		
//		if(x > y)
//		{
//			max = x;
//		}
//		else
//		{
//			max = y;
//		}
		max = (x > y)?x:y;
		
		System.out.print("큰 수는" + max);
	}

}
