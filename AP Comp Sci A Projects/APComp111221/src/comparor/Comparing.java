package comparor;
import java.util.Scanner;
public class Comparing{
	public static void main(String args[] ){
		Scanner s = new Scanner(System.in);
		try{
			System.out.println("Enter a number: ");
			int num1 = s.nextInt();
			System.out.println("Enter another number: ");
			int num2 = s.nextInt();
			if(num1>num2){
				System.out.println("Your first number is bigger");
			}else if(num2>num1){
				System.out.println("Your second number is bigger");
			}else if(num1==num2){
				System.out.println("Your numbers are equivilant");
			}
		}catch(java.util.InputMismatchException imeRef){
			System.out.println("You didn't enter a number");
		}
	}
}
