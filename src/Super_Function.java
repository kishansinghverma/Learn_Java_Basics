class test{
    test(int a){
        this();
        System.out.println("Parent Parameterized");
    }
    test(){
        System.out.println("Parent Default");
    }
}
public class Super_Function extends test{
    Super_Function(int a){
        super(9);
        System.out.println("Base Parameterized");
    }
    Super_Function(){
        this(8);
        System.out.println("Base Default");
    }
    public static void main(String[] args) {
        Super_Function obj=new Super_Function();
    }

}
