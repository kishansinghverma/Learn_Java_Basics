class demo{
    public void func(){
        int a=12;
        System.out.println(a);
        System.out.println("Parent Function");
    }
}
public class Super_KeyWord extends demo{
    public void func(){
        super.func();
        int a=10;
        System.out.println(a);
        System.out.println("Base Function");
    }

    public static void main(String[] args) {
        Super_KeyWord obj=new Super_KeyWord();
        obj.func();
    }
}
