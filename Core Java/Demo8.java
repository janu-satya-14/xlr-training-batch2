
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String loginId;
        String password;
        String reply;
        do { 
            System.out.println("Welcome to malla reddy university");
            System.out.println("have you visited our site earlier??");
            reply = s.nextLine();
                if(reply == "no") {
                    System.out.println("login here");
                    System.out.println("enter your id and password");
                    loginId = s.nextLine();
                    password = s.nextLine();
                }else
                    System.out.println("you're our valued customer");
        } while(true);
        
    }
}