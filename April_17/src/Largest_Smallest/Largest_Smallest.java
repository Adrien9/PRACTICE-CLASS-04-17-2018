package Largest_Smallest;
import java.util.Scanner;
public class Largest_Smallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 3 numbers");

		int[] num={scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};

		int smallest=num[0];
		int largest=num[0];

		for(int i=0; i<num.length; i++){

			if(smallest>num[i]){

				smallest=num[i];
			}

			if(largest<num[i]){

				largest=num[i];
			}
		}

		System.out.println("The smallest integer is " + smallest);
		System.out.println("The largest interger is " + largest);
	}
}