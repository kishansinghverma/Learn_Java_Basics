import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Basics {
    Map<String, String> test=new HashMap<>();

    public void initialize(){
        test.put("name", "kishan");
        test.put("class","mca");
        test.put("rank", "second");
        Collection<String> values=test.values();
        String[] rValues=new String[values.size()];
        int i=0;
        for(String value : values){
            rValues[i]=value;
            i++;
        }
        for(String value : rValues){
            System.out.println(value);
        }


    }
    public static void main(String[] args) {
        HashMap_Basics obj=new HashMap_Basics();
        obj.initialize();

    }
}
