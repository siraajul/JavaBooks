package Unit_One;

import java.util.Scanner;

public class RadianToDegree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radian: ");
        float radians = sc.nextFloat();

        double degree = radians*(180/3.1416);
        System.out.print("Degree: "+degree);
    }
}
