import java.util.Scanner;
public class Demo035{
    //greatest of 2 numbers by taking input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.println("Both are equal");
        }else if(num1<num2){
            System.out.println("second number is greater("+num2+")");
        }else if (num1>num2){
            System.out.println("first number is greater("+num1+")");
        }
    }
}