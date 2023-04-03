package lesson1;

public class Person {
	public static void main(String[] args) {
		
	}
	//field
	private String name;
	private int maxBooks;
	//constructors
	public Person() {
		name = "Jeff";
		maxBooks = 5;
		//methods
		public String getName() {
			return(name);
		}
		public void setName(String anyName) {
			name = anyName;
		}
		public int getMaxBooks(int maximumBooks) {
			return(maxBooks = maxBooks);
		}
	}
}
