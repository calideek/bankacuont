import javax.swing.*;
import java.util.Scanner;

public class ali {
    static void main() {
        int num1= (int)(Math.random() *10);
        int num2= (int)(Math.random() *10);
        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
            System.out.println( " what is " + (num1)+'+'+(num2) + "?");
            Scanner input=new Scanner(System.in);
            int ans =input.nextInt();
             if( ans==num1+num2){
                 System.out.println("you did great");

             }
             else {
                 System.out.println("wrong!  correct ans is :" +(num1+num2));

             }

        }
    }
}
