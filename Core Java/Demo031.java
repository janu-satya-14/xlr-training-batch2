// Demo031.java Hash Set - Collections  
import java.util.HashSet;
class HashSetDemo1 {
	void HSetMethod() {
		//We can add any type of element here...
		HashSet hashSet = new HashSet();
         hashSet.add(100);
		 hashSet.add(100);
		 hashSet.add("PRASUNAMBA");
         hashSet.add(99);
		 hashSet.add(999.99);
		System.out.println(hashSet);		
//we can use Object class to read any type of elements
		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}
public class Demo031 {
    public static void main(String[] args) {
        System.out.println("hello try");
        HashSetDemo1 hsobj = new HashSetDemo1();
        hsobj.HSetMethod();
         }
}

