
import java.util.*;

public class Unset{

    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int p=sc.nextInt();

        System.out.println(n&(~(1<<p-1)));

    }
    
}