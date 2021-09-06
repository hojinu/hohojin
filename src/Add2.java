import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int x,y, sum;
		
		System.out.print("첫 번째 수 입력 : ");
		x = inp.nextInt();
		System.out.print("두 번째 수 입력 : ");
		y = inp.nextInt();
		
		sum = x + y;
		System.out.println(sum);
	}

}
