package LandMark_Group;
import java.util.Scanner;

public class BoxVolumeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter input1: ");
        int input1 = sc.nextInt();

        System.out.print("Enter input2: ");
        int input2 = sc.nextInt();

        System.out.print("Enter input3: ");
        int input3 = sc.nextInt();

        // Calling method
        int result = boxVolume(input1, input2, input3);

        // Output
        System.out.println("Result: " + result);

        sc.close();
    }

    public static int boxVolume(int input1, int input2, int input3) {
        int count = 0;

        while (input1 > 0 && input2 > 0 && input3 > 0) {
            int g = gcd(input1, gcd(input2, input3));

            if (input1 >= input2 && input1 >= input3) {
                input1 -= g;
            } else if (input2 >= input1 && input2 >= input3) {
                input2 -= g;
            } else {
                input3 -= g;
            }

            count++;
        }

        return count;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}