import java.util.Scanner;

public class Factorial {
	
	//Method for factorials
	public static int factorial(int n){
		long factor = 1;
		for(int i =1; i<=n; i++){
			factor = factor * i;
		}
		return (int) factor;
	}

	public static void main(String[] args) {
		
		int n = 0;
		String yes = "";
		
		
		// Create scanner
		Scanner input = new Scanner(System.in);
	
		System.out.println("Welcome to the Factorial Calculator!");
		
		do{ 
		//Prompt user to enter a number
		System.out.println("Enter an integer from 1 to 10:");
			n = input.nextInt();
		
		if(n < 0){
			System.out.println("You entered a negative number. Please input a positive number:");
		}else{
			System.out.println("The factorial of " + n + " is " + factorial(n));
			
		}
			//Ask user if they want to translate another line
			System.out.println("Continue? (y/n): ");
			
				yes = input.nextLine();	
				yes = input.nextLine();
		
	      }// do ends
			while(yes.equalsIgnoreCase("y"));
        }
	 }	//psvm


