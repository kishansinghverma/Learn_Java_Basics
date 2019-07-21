public class Anonymous {
    //used for one time uses of objects
    public int[] method(){

        System.out.println("Running");
        //Anonymous Array creation
        return new int[]{1,2,3};
    }

    public static void main(String[] args) {
        //Method calling with anonymous object
        new Anonymous().method();
    }
}
class testanc{
    public void func(){
        System.out.println("Anc Class Test");
    }
}
class anc{
    public static void main(String[] args) {
        //Anonymous overriding of class methods
        testanc obj=new testanc(){
          public void func(){
              System.out.println("Anms Class obj");
          }
        };
        obj.func();
    }
    //there will generate three classes named anc.class, testanc.class, testanc$1.class
}

/*
1. i am creating a child class for testanc class without name
2. we are creating/declaring a class that extends testanc class
3. for tht child class we are creating and object with perent reference
4. we are overriding the func method
*/

class anc3{
    public void func(){
        System.out.println("Super Definition");
    }
    public static void main(String[] args) {
        anc3 obj=new anc3(){
            @Override
            public void func() {
                System.out.println("Sub Definition");
            }
        };
        obj.func();
    }
}

interface ani{
    void func();
}
class anc2{
    public static void main(String[] args) {
        //Object creation of interface using anonymous class
        ani obj=new ani() {
            @Override
            public void func() {
                System.out.println("Anms interface obj");
            }
        };
        obj.func();
    }
}

//Based on declaration and behaviour their are three types
//1. anonymous inner class that extends a class
//2. anonymous inner class that implements an interface
//3. anonymous inner class that defined inside arguments
//the main purpose of anonymous class is just for instant uses



