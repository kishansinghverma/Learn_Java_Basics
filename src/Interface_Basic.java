import java.lang.Class;
public interface Interface_Basic {
    //Marker Interface or Tagged Interface
    //used in Clonable Object
    public void m1();
}

//interface can extend another interface
interface kishan{};
interface amit extends kishan{};

class first implements Interface_Basic{

    @Override
    public void m1() {
        System.out.println("first");
    }
}
class second implements Interface_Basic{

    @Override
    public void m1() {
        System.out.println("second");
    }
}
class test2{
    void m1(second obj){
        System.out.println(obj.toString());
    }
    void m1(first obj){
        System.out.println(obj.toString());
    }

    void m1(Interface_Basic obj){
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        test2 obj=new test2();
        obj.m1(new first());
        obj.m1(new second());
        obj.m1(new Interface_Basic() {
            @Override
            public void m1() {
                System.out.println("Implementation");
            }
        });
    }
}

