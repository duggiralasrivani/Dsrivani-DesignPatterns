package structural_Facade;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class FacadePattern {
	private static int  option;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do
        {       
            System.out.print("|-------- Reliance Digital Shop --------| \n");  
            System.out.print("            1. LLoyd              \n");  
            System.out.print("            2. Ogeneral           \n");  
            System.out.print("            3. Daikin            \n");  
            System.out.print("            4. Exit.             \n");  
            System.out.print("Enter your option: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            option=Integer.parseInt(br.readLine());  
            Company_customer sk=new Company_customer();  
              
            switch (option) {  
            case 1:  
                {   
                  sk.LLoydSale();  
                  System.out.println("     Thank you for shopping, Visit again    ");

                 }  
                break;  
           case 2:  
                {  
                  sk.OGeneralSale();   
                  System.out.println("     Thank you for shopping, Visit again    ");

                }  
                break;    
           case 3:  
                {  
                           sk.DaikinSale();    
                           System.out.println("     Thank you for shopping, Visit again    ");
                }  
                break;     
            default:  
            {    
                System.out.println("Please visit our shop Again,  Thank you!!");  
            }         
                return;  
            }  
              
      }while(option!=4);  
   }  

}
