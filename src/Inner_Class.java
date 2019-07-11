public class Inner_Class {
    //some time we can declare class inside another class, such type of classes are called as inner classes
    //member class,  simple inner class
    //static class, having static keyword
    //local class, class inside method
    //anonymous class, without name

    //in collection interface there is a class map, here we use inner class 'Entry' to input data in data structure
    //Map is a group of key value pairs and each key value pair is called as entry,
    //without existing map object there is no chance of existing entry object
    //hence interface entry is defined inside map interface
    //the relation b/w outer and inner class is not "is relationship" and it is "has relationship"

}

class oc{
    static class ic{
        //there will generate two classes named
        //oc.class and oc$ic.class

        public static void main(String[] args) {
            ic obj=new ic();
        }
    }
    //cant declare static member in any inner class
    // however we can make inner class static to do so
    // but cant use object functionality as static members associates with class not object
    //so outer class member will not be accessible
}


class oc1{
    class ic1{
        void func(){
            System.out.println("Inner class");
        }
    }
    //accessing inner class code from non static area of outer class
    public void func1(){
        ic1 obj=new ic1();
        obj.func();
    }
    //accessing inner class code from static area of outer class
    public static void main(String[] args) {
        /*
        oc1 obj=new oc1();
        oc1.ic1 obj1=obj.new ic1();
        can do it this way also
        */
        oc1.ic1 obj=new oc1().new ic1();
        obj.func();
        new oc1().func1();
    }
}
//Accessibility in inner class
class oc2{
    int x=10;

    class ic2{
        int x=20;
        void func(){
            int x=30;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(ic2.this.x);
            System.out.println(oc2.this.x);
        }
    }

    public static void main(String[] args) {
        new oc2().new ic2().func();
    }
}