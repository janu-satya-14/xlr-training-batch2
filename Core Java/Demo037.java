import java.util.Scanner;
public class Demo037{
// //greatest of 4 numbers by taking input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        System.out.println("Enter fourth number:");
        int d = scanner.nextInt();

        if(a >= b && a >= c && a>=d){
            System.out.println("a is greatest("+a+")");
        }else if(b >= a &&  b >= c && b >= d){
            System.out.println("b is greatest("+b+")");
        }else if(c >= a &&  c >= b && c >= d){
                System.out.println("c is greatest("+c+")");
        }else {
            System.out.println("d is greatest("+d+")");
        }
    }
}