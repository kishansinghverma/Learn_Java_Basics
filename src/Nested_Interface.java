public interface Nested_Interface {
    interface ni1{
        void m2();
    }
    void m1();
}

class nc1 implements Nested_Interface, Nested_Interface.ni1{

    @Override
    public void m1() {
        System.out.println("Method 1");
    }

    @Override
    public void m2(){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        new nc1().m1();
    }
}
