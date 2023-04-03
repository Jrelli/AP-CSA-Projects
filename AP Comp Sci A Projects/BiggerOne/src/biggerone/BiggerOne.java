package biggerone;
import java.util.Scanner;

public class BiggerOne {
	public static void main(String Args[]) {
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Enter the first number: ");
		num1 = s.nextInt();
		System.out.println("Enter the second number: ");
		num2 = s.nextInt();
		System.out.println("The bigger number is: " + findBigger(num1,num2));
	}
	private static int findBigger(int n1, int n2) {
		if(n1>n2) {
			return(n1);
		}else if(n2>n1) {
			return(n2);
		}else {
			return(n1);
		}
	}
}
