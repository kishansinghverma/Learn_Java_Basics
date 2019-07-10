public class String_Basics {
    //it is a final class so cant inherit
    //its immutable, cant further change

    String a="abc";
    String b="abc";
    //if directly provided literal then stored in constant pool area
    // in string constant pool we cant store duplicate values
    //so both will reference to the same object

    String c=new String("aaa");
    String d=new String("aaa");
    //these will store in heap storage
    //each one allocate memory for different object

    StringBuffer s1=new StringBuffer("Kishan");
    StringBuffer s2=new StringBuffer("Amit");
    //StringBuffer and StringBuilder does not override method equals from object class so it will compare the references
    //but String class Overrides this method so it compares the values inside reference

    public static void main(String[] args) {
        String_Basics obj=new String_Basics();
        System.out.println(obj.a.equals(obj.b));
        System.out.println(obj.a==obj.b);
        System.out.println(obj.c.equals(obj.d));
        System.out.println(obj.c==obj.d);
        System.out.println(obj.s1.equals(obj.s2));
    }
}
