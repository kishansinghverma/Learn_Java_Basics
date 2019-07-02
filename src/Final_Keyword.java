public class Final_Keyword {
    //final int a; //only initilizable through constructor or instance block
    final int a;
    static final int x;

    static {
        x=230;
    }

    {
        a=500;
    }

    /*
    Final_Keyword(){
        a=10;
    }
    */

    void show() {
        System.out.println(a);
    }
    void test(){
        final int b;
        b=10;
        System.out.println(b);

    }

    public static void main(String[] args) {
        Final_Keyword obj=new Final_Keyword();
        obj.test();
        System.out.println(obj.a);
        System.out.println(Final_Keyword.x);
    }
    /* final is rarely used as it violets the basic principal of oops and  */
}
