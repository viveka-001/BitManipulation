
import java.util.*;


public class Main
{
	

   public static void main(String[] args) {
		

       Scanner sc=new Scanner(System.in);
		

       int n=sc.nextInt();
		

       int p=sc.nextInt();
		

       if(p==0){
		    

              System.out.println("Invalid Position");
		

        }
	    

        else if((n&(1<<p-1))>0){
		        

              System.out.println("Yes");
		   
        
         }
		 

         else{
		        

               System.out.println("No");
		    

          }
		
	

       }


  }