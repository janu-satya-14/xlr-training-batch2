import java.math.BigInteger;
import java.util.Scanner;
public class Demo7 
{
    public static void main(String args[])
    {
        String name;
        int age;
        BigInteger phoneno;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name:");
        name = s.nextLine();
        System.out.print("Enter Age:");
        age = s.nextInt();
        System.out.print("Enter Phone number:");
        phoneno = s.nextBigInteger();
    }
}