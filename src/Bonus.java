import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		final int TARGETSALES = 1000;
		int mySales, Bonus;
		String result;
		
		System.out.print("실적을 입력 하시오(단위 만원) : ");
		mySales = scn.nextInt();
		
		if(mySales - TARGETSALES > 0) {
			result = "실적 달성";
			Bonus = (mySales - TARGETSALES) / 10;
		} 
		else 
		{
			result = "실적 달성 실패";
			Bonus = 0;
		}
		
		System.out.println(result + "보너스 =" + Bonus);
	}

}
