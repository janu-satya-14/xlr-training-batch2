//2 classes and one main class
// implement method overloading 
//not everything in main
public class Demo054{
    public static void main(String[] args) {
        Cal c = new Cal();
        c.add(1,3);
        c.add(2.1,3.0,4.0);
}
}
class Cal{
    void add(int a, int b){
        System.out.println("The sum of two numbers is: "+(a+b));
    }
    void add(double a, double b, double c){
        System.out.println("The sum of three numbers is: "+(a+b+c));
    }
}
