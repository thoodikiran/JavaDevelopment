/**
 * Created by THOODI on 11/2/2016.
 */
public class Person {
    private String name ="Kira";
    private int age=21;
    public void talk()
    {
        System.out.println("The name of the Person is:"+name);
        System.out.println("The age of the Person is:"+age);
    }
}
class Demo{
    public static void main(String[] args) {
        Person raju = new Person();

        raju.talk();
    }
}