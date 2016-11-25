/**
 * Created by THOODI on 10/16/2016.
 */
public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int number = 6;
        for (int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("THe factorial of " + number + " is" + fact);
    }
}
