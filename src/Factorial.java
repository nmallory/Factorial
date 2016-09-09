import java.util.Scanner;

public class Factorial {
	
	//Method for factorials
	
	public static int factorial(int n){
		int result1;
		
		if(n==1){
			result1 = 1;
			return result1;	
		}else{
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		
		int n = 0;

		// Create scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Factorial Calculator!");
		
		//Prompt user to enter a number
		System.out.println("Enter an integer from 1 to 10:");
			n = input.nextInt();
			
		if(n < 0){
			System.out.println("You entered a negative number. Please input a positive number:");
		}else{
			System.out.println("The factorial of " + n + " is " + factorial(n));
		}	
	
	}
}
