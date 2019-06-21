public class Operator_Overloading {
    public static void main(String[] args) {
        String a="GLA";
        int b=10;
        int c=20;
        int d=30;
        //a=b+c+d; String and int not allowed
        a=a+b+c+d; //auto boxed to string


        //int x=y=z=20;
        //y amd z not declared
        
        byte b1=10;
        b1 += 10; //Implicit type Conversion
        System.out.println(b1);


    }
}
