/**
 * Created by THOODI on 10/16/2016.
 */
public class DisplayTriangle {
    public static void main(String[] args) {
        int outerrow = 5;
        for(int i=1; i<=outerrow;i++)
        {
            for (int str=1;str<=i;str++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }

    }
}
