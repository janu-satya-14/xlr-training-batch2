import java.util.Scanner;
public class Demo034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is Even number");
        }else{
            System.out.println("Number is odd");
        }

    }
}