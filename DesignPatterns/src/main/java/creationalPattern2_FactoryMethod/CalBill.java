package creationalPattern2_FactoryMethod;
import java.io.*;    

public class CalBill {

	public static void main(String args[])throws IOException{  
	      GetShoesName gs = new GetShoesName();  
	        
	      System.out.print("enter the shoe company ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String shoename=br.readLine();  
	      System.out.print("Enter the tax for which shoe costs: ");  
	      int tax=Integer.parseInt(br.readLine());  
	  
	      AbstractShoes p = gs.getPlan(shoename);  
	  
	       System.out.print("Bill amount for "+shoename+" of  "+tax+" units is: ");  
	           p.getPrice();  
	           p.calculationBill(tax);  
	            }  
	
	
	
	
}
