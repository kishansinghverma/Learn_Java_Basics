public class Static_Block extends parent {

    static {
        System.out.println("Static Block of Child");
    }

    {
        System.out.println("Instance Block of Child");
    }
    Static_Block(){
        System.out.println("Constructor of Child");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        //Static_Block obj=new Static_Block();
    }
}

class parent {
    {
        System.out.println("Instance Block of Parent");
    }
    static {
        System.out.println("Static Block of Parent");
    }
    parent(){
        System.out.println("Constructor of Parent");
    }
}
