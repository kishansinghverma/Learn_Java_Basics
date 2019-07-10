public class Arithmatic_Operators {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println('a'+.78);
        System.out.println(10/0.0);
        System.out.println(10.0/0.0);
        System.out.println(10.0/0);
        System.out.println(0.0/0.0);
        System.out.println(0/0.0);
        System.out.println(0.0/0);
        try {
            System.out.println(0 / 0);
        }catch (ArithmeticException e){System.out.println("Arithmetic Exception");}

        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e){System.out.println("Arithmetic Exception");}

        //No Way to represent infinity in integer arithmetic,
        //but in floating point arithmetic there is a way to represent infinity in both the classes we have predefined constant
        //to represent infinity ie. +ive infinity and -ive infinity


    }
}

class test5{
    byte b;

    public static void main(String[] args) {
        test5 obj=new test5();
        //obj.b=20*10 out of range
        obj.b=20*2; // allowed for this range
        byte c=2;
        obj.b= (byte)(c*10); // type casting required
        System.out.println(obj.b);
    }
}
