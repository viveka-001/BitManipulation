
import java.util.*;

public class SubSet{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)

        {

            a[i]=sc.nextInt();

        }

        List<List<Integer>> b=new ArrayList<>();

        for(int i=0;i<Math.pow(2,n);i++)

        {
            List<Integer> c=new ArrayList<>();

            for(int j=0;j<n;j++)

            {
                
                if((i&(1<<j))>0)

                {

                    c.add(a[j]);

                }
            }

            b.add(c); 
            
        }

        System.out.println(c);
    }
    
}