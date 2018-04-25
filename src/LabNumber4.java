//Jill Xu (pair programm with
//This program display a table of powers.
import java.util.Scanner;

public class LabNumber4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		String cont = "y";

		System.out.println("Learn your squares and cubes!");
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
			num = scnr.nextInt();
			System.out.printf("%1$-9s %2$-10s %3$-10s", "Number", "Squared", "Cubed");


			System.out.printf("\n%1$-9s %2$-10s %3$-10s", "=======", "=======", "======");
			
			for (int i = 1; i <= num; i++) {

				int Squared = (int) Math.pow(i, 2);
				int Cubed = (int) Math.pow(i, 3);
				System.out.printf("\n%1$-9d %2$-10d %3$-10d", i, Squared, Cubed);
				
			}
			System.out.println("\nContinue?(y/n): ");
			cont = scnr.next();

		}
		System.out.println("Goodbye!");
		scnr.close();
	}

}
