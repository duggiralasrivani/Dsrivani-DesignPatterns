package creationalPattern2_FactoryMethod;

abstract class AbstractShoes {
	  protected int price;  
      abstract void getPrice();  

      public void calculationBill(int tax){  
           System.out.println(tax+price);  
       }  
	
	
	
}
