import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: "); //prompt user for weight in pounds
        double weightInPounds = scanner.nextDouble(); //get next user double input

        System.out.print("Enter height in inches: "); //prompt user for height in inches
        double heightInInches = scanner.nextDouble(); //get next user double input

        final double WEIGHT_IN_KILOGRAMS = weightInPounds * 0.45359237; //convert weight in pounds to kilograms
        final double HEIGHT_IN_METERS = heightInInches * 0.0254; //convert height in inches to meters

        double BMI = WEIGHT_IN_KILOGRAMS / Math.pow(HEIGHT_IN_METERS, 2); //bmi = weight in kilograms / sqr(height in meters) -> Math.pow(height, 2)

        System.out.println("BMI is " + BMI); //print BMI

        if (BMI < 18.5) //if (BMI < 18.5) --> underweight
            System.out.println("Underweight");
        else if (BMI >= 18.5 && BMI < 25.0) //if (18.5 <= BMI < 25.0) --> normal
            System.out.println("Normal"); 
        else if (BMI >= 25.0 && BMI < 30.0) //if (25.0 <= BMI < 30.0) --> overweight
            System.out.println("Overweight"); 
        else //if (BMI >= 30.0) --> obese
            System.out.println("Obese"); 
    }
}

/*
Chapter 3 group exercise:

Enter weight in pounds: 146.0
Enter height in inches: 70.0
BMI is 20.948603801493316
Normal
*/
