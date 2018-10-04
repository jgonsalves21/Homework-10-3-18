/**
 * 
 * jgonsalves21
 * NameNumberMain
 * 
 */
	import java.util.Scanner;

public class NameNumberMain {
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please print your name:");
		String name = in.nextLine();
		
		System.out.print("Please print your phone number (no spaces):");
		String number = in.next();
		in.nextLine();
		
		
		String sub1 = number.substring(0, 3);
		String sub2 = number.substring(3, 6);
		String sub3 = number.substring(6);
		
		System.out.printf("%-20s" + "(" + sub1 + ")" + " " + sub2 + "-" + sub3, name);

	}

}
