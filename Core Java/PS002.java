import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int roundedNumber = ((number + 50) / 100) * 100;
        System.out.println("The number rounded to the nearest hundred is: " + roundedNumber);
        
        scanner.close();
    }
}
