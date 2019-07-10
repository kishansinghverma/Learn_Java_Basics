import java.lang.Class;
public interface Interface_Basic {
    //Marker Interface or Tagged Interface if no method declared in that
    //which is used in Cloneable Object

    //100% abstraction
    //interfaces are lightweight as compared to abstract class
    //in interface we cant use concrete method, static block, instance initialization block, constructor,
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

class t1{
    public interface test{};

};
interface xyz{
    class abc{}
}
//can define class inside the interface and vice versa
//every block inside a interface is static already

interface test4{
    void m1();
    void m2();
    void m3();
}

abstract class c2 implements test4 {
    public void m1(){
        System.out.println("M1");
    }
}
class c3 extends c2{

    @Override
    public void m2() {
        System.out.println("M2");
    }

    @Override
    public void m3() {
        System.out.println("M3");
    }

    public static void main(String[] args) {
        c3 oobj=new c3();
        oobj.m1();
        oobj.m2();
        oobj.m3();
    }
}
/*

1. if we do not know anything about implementation just we have requirement specification
than we should go for interface
if we are talking about implementation but not completely then we should go for abstract class

inside interface every method is always public and abstract weather we are declaring or not
Hence interface is also considered as 100% abstraction(100% pure abstract class)
Every method present in abstract class need not be public and abstract in addition
to abstract methods we can take concrete methods also

we cant declare abstract method with private, protected, static, synchronized, native strictfp
and final modifiers
there are no restriction on abstract class method modifiers

every variable present inside the interface is always public static final whether we are declaring it or not
but in abstract class they need not be public static final

its mandatory to initialize every variable in interface at the time of declaration otherwise compile time error
but not in the case of abstract class

we cant declare interface variables with private protected volatile and transient
there are no restriction on abstract class modifiers

in interface we cant define static block and instance initialization block and also constructors
but can do it in abstract class
*/


