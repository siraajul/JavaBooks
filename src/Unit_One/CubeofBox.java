package Unit_One;

import java.util.Scanner;

public class CubeofBox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Width: ");
        int width = sc.nextInt();
        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        int volume = length*width*height;

        System.out.print("Volume: "+volume);
    }
}
