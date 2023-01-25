package Unit_One;

import java.util.Scanner;

public class InputOutPutCalculations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int first_number = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second_number = sc.nextInt();

        int addition = first_number+second_number;
        int subtraction = first_number-second_number;
        int multiplication = first_number*second_number;
        int division = first_number/second_number;

        System.out.println("Addition of Two Number is : "+addition);
        System.out.println("Subtraction of Two Number is: "+subtraction);
        System.out.println("Multiplication of Two Number is:"+multiplication);
        System.out.println("Division of Two Number is: "+division);
    }
}
