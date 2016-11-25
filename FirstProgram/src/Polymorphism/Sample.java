package Polymorphism;

/**
 * Created by THOODI on 11/3/2016.
 */
public class Sample {
    void sum(int a, int b){
        System.out.println("The addition of two numbers are:"+ (a+b));
    }
    void sum(int a, int b, int c){
        System.out.println("The addition of Three numbers are:"+(a+b+c));
    }
}
class Poly{
    public static void main(String[] args) {
        Sample s = new Sample();
        s.sum(10,20);
        s.sum(10,20,30);
    }
}