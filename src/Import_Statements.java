import java.lang.*; // normal import
import java.*;
import static java.lang.System.out;
import static java.lang.Float.MAX_VALUE;
import static java.lang.Integer.*;

public class Import_Statements {
    static int MAX_VALUE=20;
    //Highest priority is given to fully specified class paths
    //Second priority is given to classes in pwd
    //then implicit class are taken into account

    //For static import first preference will given to default package
    //class variable are given highest preference

    public static void main(String[] args) {
        out.println(MAX_VALUE);
    }


}

