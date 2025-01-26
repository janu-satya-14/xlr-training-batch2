import java.util.Scanner;
public class Demo038{
    //converting a string to lower and upper case
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");

        String a = scanner.next();
        System.out.println(a.toLowerCase());
                System.out.println(a.toUpperCase());
        }
    }