package main;
import java.util.Scanner;

public class QE {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, root1, root2;
		Scanner scan = new Scanner (System.in);
		
		try{
			System.out.println("Enter a");
			a = scan.nextDouble();
			System.out.println("Enter b");
			b = scan.nextDouble();
			System.out.println("Enter c");
			c = scan.nextDouble();
		}catch(java.util.InputMismatchException imeRef){
			System.out.println("You didn't enter a number");
		}
		root1 = ((-1*b) + Math.pow(b, 2) - (4*a*c));
		root2 = (b + Math.pow(b, 2) - (4*a*c));
		System.out.println("negative b: " + root1);
		System.out.println("positive b: " + root2);
	}
}
