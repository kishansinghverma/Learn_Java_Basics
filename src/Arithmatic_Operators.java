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
        }catch (ArithmeticException e){System.out.println("Arithmetic Exceptiom");}

        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e){System.out.println("Arithmetic Exception");}

        //No Way to represent infinity in integer arithmetic,
        //but in floating point arithmetic there is a way to represent infinity in both the classes we have predefined constant
        //to represent infinity ie. +ive infinity and -ive infinity
    }
}
