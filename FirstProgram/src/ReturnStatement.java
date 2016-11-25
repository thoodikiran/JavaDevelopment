/**
 * Created by THOODI on 10/16/2016.
 */

public class ReturnStatement {
    public static void main(String[] args) {
        int Result = ReturnStatement.myMethod(10);  //since both are static methods, we can call the method directly using classname.methodname.
        System.out.println("The Result is :"+ Result);


        ReturnStatement rs = new ReturnStatement();//Sine the modifiers for the method are different, need to create object with that class to call the respective method.
        int ResultAdd =rs.myMethod(10,20);
        System.out.println("The addition of two numbers are:" + ResultAdd );

    }
    static int myMethod(int num)
    {
        return num*num;
    }
    public int myMethod(int a, int b)
    {
        int c =a+b;
        return c;
    }

}
