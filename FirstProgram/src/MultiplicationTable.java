/**
 * Created by THOODI on 10/16/2016.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 3;
        for(int i=1; i<=10; i++)
        {
            int product = number*i;
            System.out.println( number +"X"+i +"="+product);
        }
    }
}
