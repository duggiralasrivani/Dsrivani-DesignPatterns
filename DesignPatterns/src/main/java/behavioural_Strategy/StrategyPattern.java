package behavioural_Strategy;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class StrategyPattern {  
      
    public static void main(String[] args) throws NumberFormatException, IOException {  
          
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          System.out.print("Enter the Cost : ");  
          int cost=Integer.parseInt (br.readLine());  
          System.out.print("Enter the Discount value: ");  
          int discount=Integer.parseInt (br.readLine());  
          ContextClass context = new ContextClass(new DressCostCalculation());          
          System.out.println("Total bill  for dress = " + context.printStrategy(cost, discount));  
  
          context = new ContextClass(new SandalsCostCalculation ());       
          System.out.println("Total bill for sandals = " + context.printStrategy(cost, discount));  
  
    }  
       }  
  
