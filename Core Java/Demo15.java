import java.util.Scanner;

public class Demo15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int b = scanner.nextInt();

        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("First value: " + a);
        System.out.println("Second value: " + b);

        scanner.close();
    }
}