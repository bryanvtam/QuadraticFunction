import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		boolean continues= true; 
		Scanner scanner = new Scanner(System.in);
		while (continues) {
			System.out.println(Quadratic.quadrDescriber(0,0,0));
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String answer = scanner.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("QUIT")) {
				continues = false;
			}
			else {
				continues = true;
			}
		}
	}
}
