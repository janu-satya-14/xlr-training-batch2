import java.util.Scanner;
public class Demo036{
    //greatest of 2 numbers by taking input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        if(a >= b && a >= c){
            System.out.println("a is greatest("+a+")");
        }else if(b >= a &&  b >= c){
            System.out.println("b is greatest("+b+")");
        }else{
                System.out.println("c is greatest("+c+")");
        }
    }
}