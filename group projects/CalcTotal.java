import java.util.Scanner; //import scanner

public class CalcTotal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //initialize scanner

		System.out.print("Enter the subtotal and a gratuity rate: "); //prompt user to input subtotal and gratuity rate
		double subTotal = scanner.nextDouble(); //get next double input from user -> subTotal
		double gratuityRate = scanner.nextDouble(); //get next double input from user -> gratuityRate

		gratuityRate /= 10; //divide gratuityRate by 10 -> gratuityRate = gratuityRate / 10
		subTotal += gratuityRate; //add gratuityRate to subTotal -> subTotal = subTotal + gratuityRate

		System.out.println("The gratuity is $" + gratuityRate + " and total is $" + subTotal); //print whole statement w/ results
	}
}
