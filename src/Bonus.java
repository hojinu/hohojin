import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		final int TARGETSALES = 1000;
		int mySales, Bonus;
		String result;
		
		System.out.print("������ �Է� �Ͻÿ�(���� ����) : ");
		mySales = scn.nextInt();
		
		if(mySales - TARGETSALES > 0) {
			result = "���� �޼�";
			Bonus = (mySales - TARGETSALES) / 10;
		} 
		else 
		{
			result = "���� �޼� ����";
			Bonus = 0;
		}
		
		System.out.println(result + "���ʽ� =" + Bonus);
	}

}
