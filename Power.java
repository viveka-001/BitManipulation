
import java.util.*;


public class Power{
	

    public static void main(String[] args) {
		

         Scanner sc=new Scanner(System.in);
		

         int n=sc.nextInt();
		

         if(n==0){
		   
     
               System.out.println("No");
		
         }
		
    
         else{
		    
 
             if((n&n-1)==0){
		        
    
                   System.out.println("Yes");
		    

              }
		    

              else{
		        

                    System.out.println("No");
		    

               }


	}
	

    }


}