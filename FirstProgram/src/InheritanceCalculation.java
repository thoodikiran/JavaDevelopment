/**
 * Created by THOODI on 10/31/2016.
 */
class InheritanceCalculation {
    int z;
    public void add(int x, int y)
    {
        z=x+y;
        System.out.println("The addition of two numbers are:" + z);
    }
    public void sub(int x, int y)
    {
        z=x-y;
        System.out.println("The Subtraction of two numbers are:" + z);
    }
}
class My_Calculation extends InheritanceCalculation{
    public void mul(int x,int y){
        z=x*y;
        System.out.println("The Subtraction of two numbers are:" + z);
        }
public static void main(String args[]){
    int a=20,b=10;
    My_Calculation demo = new My_Calculation();
    demo.add(a,b);
    demo.sub(a,b);
    demo.mul(a,b);
}
}




