/**
 * Created by THOODI on 11/1/2016.
 */
public class OverridingEx {
    public void move() {
        System.out.println("THis is superclass");
    }
}
    class Sub_Class extends OverridingEx {
        public void move() {
            System.out.println("This is Subclass");
        }
    }
    class TestObjective {
        public static void main(String args[]) {
            OverridingEx a = new OverridingEx();
            OverridingEx b = new Sub_Class();
            a.move();
            b.move();
        }
    }
