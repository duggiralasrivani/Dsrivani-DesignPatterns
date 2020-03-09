package creationalPattern2_FactoryMethod;

public class GetShoesName {
	   public AbstractShoes getPlan(String shoeCompany){  
           if(shoeCompany == null){  
            return null;  
           }  
         if(shoeCompany.equalsIgnoreCase("BATA")) {  
                return new BataShoes();  
              }   
          else if(shoeCompany.equalsIgnoreCase("KHADIMS")){  
               return new KhadimsShoes();  
           }   
         else if(shoeCompany.equalsIgnoreCase("WOODLANDS")) {  
               return new WoodlandsShoes();  
         }  
     return null;  
  }  
	
	
	
	
	
	
}
