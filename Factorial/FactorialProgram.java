import java.util.Scanner;
public class FactorialProgram {
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.print("ENTER A NUMBER: ");
		
		int factorialForUserInput = input.nextInt();


		int factorialResult = 1;


		for (int count = 1; count <= factorialForUserInput; count++){
		
		factorialResult *= count;
		
		}

		System.out.print(factorialResult);




	}
}