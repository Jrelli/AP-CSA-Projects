package dayname;
import java.util.Scanner;

public class Dayname {
	public static void main( String[] args ) {
		Scanner s = new Scanner( System.in );
		int dayNum;
		
		System.out.println("Enter the number of the day in a week (1-7)");
		dayNum = s.nextInt();
		
		String result = getName(dayNum);
		System.out.println(result);
	}
	private static String getName(int dayNumber) {
		if (dayNumber == 1) {
			return("Sunday");
		}else if(dayNumber == 2) {
			return("Monday");
		}else if(dayNumber == 3) {
			return("Tuesday");
		}else if(dayNumber == 4) {
			return("Wednesday");
		}else if(dayNumber == 5) {
			return("Thursday");
		}else if(dayNumber == 6) {
			return("Friday");
		}else if(dayNumber == 7) {
			return("Saturday");
		}else {
			return("Not a Valid Day Number!");
		}
	}
}