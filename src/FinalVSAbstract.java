public abstract class FinalVSAbstract {
    //cant use final and and abstract with class
    //can use abstract with method in final class
    //if the instance variable is not final jvm will provide the default value
    //if its final the jvm will not initialize, we have to do

    public void show(){
        System.out.println("Hello");
    }
}
class test1 extends FinalVSAbstract{
    //final int a;
    void func(final int x){
        //x=20;
        //we can use final for parameter but the value cant be changed further in method
        //the only modifier we can use with local variable is final

    }

    public static void main(String[] args) {
        final int x;
        test1 obj=new test1();
        obj.show();
    }
}

