import java.util.Scanner;

public class eameone {
    static void main() {
        //Casting |Implicit | Explicit
        //implicit casting = smaller range into a larger range
        //implicit automatic java will do the casting operation
        int x =8; // smaller range
        double d = x; // larger range
        System.out.println("The value d: " + d);
        //explicit casting = larger range into small
        double y = 7.9; // fraction part will be truncated
        int z = (int)y; // casting operation
        System.out.println("The value of z: " + z);
        //augmented assignment casting
        int sum = 0;
        sum +=4.5; //sum = (int)(sum + 4.5)
        System.out.println("The value of sum: " + sum);


    }
}
