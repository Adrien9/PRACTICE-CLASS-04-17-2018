package Search;
import java.util.Scanner;
public class Search {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);	

		System.out.println("Enter 5 Strings");

		String[]array={scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()};

		System.out.println("Enter the name you are searching");
		String name=scanner.nextLine();

		for(int i=0; i<array.length; i++){

			if(name.equals(array[i])){

				System.out.println("The String at " + array[i].length() + " in the array is a match! That String is " + array[i] +".");
			}

			else{

				System.out.println("There is no match");
			}
		}
	}
}
