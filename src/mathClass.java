import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        /*
        .PI for the PI
        .max for the max between two numbers
        .min for the minimum between two numbers
        .pow 2^6 = 2 to the power of 6
        .abs positive of a negative integer
        .sqrt square root
        .round roundup/down
         */

        double radius;
        double circumference;
        double area;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2); // (3.14)(r^2)
        volume = (4.0  / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference: %.2f", circumference);
        System.out.printf("\nArea: %.2f", area);  // printf : use %.[x]f and , instead of plus, x meaning how many numbers to display
        System.out.printf("\nVolume: %.2f", volume);

        scanner.close();
    }
}
