public class Increment_Operator {
    public static void m1(){
        byte b=10;
        b=(byte)(b+1);

    }
    public static void m2(){
        byte b=10;
        byte c=20;
        b=(byte)(b+c);

    }
    public static void m3(){
        byte b=10;
        b++;
    }

    public static void m4(){
        byte b=10;
        //++(b++); Constant Value not applicable
        //++b++;
        //++b--;
    }

    public static void main(String[] args) {
        m1();m2();m3();m4();
    }
}
