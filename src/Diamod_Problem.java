
public interface Diamod_Problem {
    int i=10;
}

interface i1{
    int i=20;
}
class c5 implements Diamod_Problem, i1{
    public static void main(String[] args) {
        c5 obj=new c5();
        System.out.println(i1.i);
        System.out.println(Diamod_Problem.i);
    }
}
/*
abstract class c6{
    abstract void show();
}

interface i2 implements c6{
  not feasible
}
*/

//class c1 implements i1 extends c2 not allowed
//class c1 extends c2 implements i1 allowed

// inheritance concept

interface i2{
    void m1();
}
interface i3{
    void m1();
}

class c6 implements i2, i3{

    @Override
    public void m1() {
        System.out.println("Single Definition Allowed and sufficient");
    }

    public static void main(String[] args) {
        i2 obj=new c6();
        obj.m1();
    }
}