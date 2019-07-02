import java.util.*;

public class Grundy_Numbers
{

    static int calculateMex(HashSet<Integer> Set)
    {
        int Mex = 0;

        while (Set.contains(Mex))
        {
            Mex++;
        }
        return (Mex);
    }

    static int calculateGrundy(int n, int m)
    {
        for(int i=0; i<=m; i++){
            if (n==i)
                return i;
        }
        HashSet<Integer> Set = new HashSet<Integer>();

        for (int i = 1; i <= m; i++)
        {
            Set.add(calculateGrundy(n - i, m));
        }
        return (calculateMex(Set));
    }

    public static void main(String[] args)
    {
        int n = 100000;
        int m = 30;
        System.out.printf("%d", calculateGrundy(n, m));
    }
}
