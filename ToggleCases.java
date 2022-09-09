
import java.util.*;

public class ToggleCases{

    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);

        System.out.println(ch^(1<<5));

    }
    
}