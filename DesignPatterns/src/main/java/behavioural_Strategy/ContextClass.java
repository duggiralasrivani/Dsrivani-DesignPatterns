package behavioural_Strategy;

public class ContextClass {

	 private Strategy_interface strategy;  
     
     public ContextClass(Strategy_interface strategy){  
        this.strategy = strategy;  
     }  

     public int  printStrategy(int  cost, int discount){  
        return strategy.tot_price(cost, discount);  
     }  
	
	
}
