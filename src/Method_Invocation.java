public class Method_Invocation {
    public static void method(Object obj){
        System.out.println("Object");
    }

    public static void method(Number number){
        System.out.println("Number");
    }
    public static void method(Integer str){
        System.out.println("Integer");
    }
    public static void method(String obj){
        System.out.println("String");
    }
    public static void method(StringBuilder obj){
        System.out.println("String Builder");
    }
    public static void method(StringBuffer obj){
        System.out.println("String Buffer");
    }
    public static void main(String[] args) {
        method(new StringBuffer("Kishan"));
    }
}
