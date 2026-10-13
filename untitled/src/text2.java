import java.util.Scanner;

public class text2 {
    static void main() {
        int num = 789;
        int sum = 0;
        String digit = "";
        sum += num % 10;
        digit = digit + num %10;
        num = num / 10;
        sum += num % 10;
        digit = digit + num %10;
        num = num / 10;
        sum += num % 10;
        digit = digit + num %10;

        System.out.println(sum);
        System.out.println(digit);

    }
}
