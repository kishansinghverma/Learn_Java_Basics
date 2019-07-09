abstract public class Abstract_Class {
    public abstract void m1();
}

abstract class test3 extends Abstract_Class{
    public void m1(){
        System.out.println("Hello");
        //can inherit abstract class into another abstract class
    }
}
class c1 extends test3{
    public void m1(){
        System.out.println("Working");
    }

    public static void main(String[] args) {
        Abstract_Class obj=new c1();
        obj.m1();
        //this is upcasting, where we use object of perent class to hold the reference of child class;
    }
}