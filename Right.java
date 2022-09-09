
import java.util.*;

public class Right{

    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a=0;

        if(n==0)

        {

            System.out.println("Invalid Input");

        }

        while(n>0)

        {

            if((n&1)>0)

            {

                System.out.println(1<<a);

                System.exit(0);

            }

            n=n>>1;

            a++;

        }

    }

    
}