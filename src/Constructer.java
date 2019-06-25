public class Constructer{
    static int count=0;
    {
        count++;
    }

    public Constructer(){
        //count++;
    }
    public Constructer(int a){
        //count++;
    }
    public Constructer(int a, int b){
        //count++;
    }

    public static void main(String[] args) {
        Constructer obj=new Constructer();
        Constructer obj1=new Constructer(8);
        Constructer obj2=new Constructer(2,8);
        System.out.println(count);
    }
}
