package mainMadlib;
import java.util.Scanner;


public class CatTheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare object
		Scanner ml =  new Scanner(System.in);
		
		System.out.println("Please enter a verb: ");
		//asking for input from user for madlib
		String verb = ml.nextLine();

		System.out.println("Please enter a noun: ");
		String noun = ml.nextLine();
		
		System.out.println("Please enter a ajective: ");
		String adjective = ml.nextLine();
		
		System.out.println("Please enter a noun2: ");
		String noun2 = ml.nextLine();
	
		//input from user on madlib
		System.out.println("Why do the " + noun + "(s)" + " always think they can " + verb + " to " + adjective + " people who have " + noun2 + "(s).");
		
		ml.close();
	}

}
