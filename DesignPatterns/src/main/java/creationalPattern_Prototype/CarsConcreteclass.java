package creationalPattern_Prototype;

public class CarsConcreteclass implements Prototype {

	   private String Carname;
	   private String model;
	   private String fuel;  
	   private double price;  
	      
	   public CarsConcreteclass(){  
	            System.out.println("   Cars Detailed information ");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("Carname"+"\t"+"model"+"\t"+"fuel"+"\t"+"price");  
	            System.out.println("---------------------------------------------");  
    
	}  
	  
	 public  CarsConcreteclass(String Carname, String model, String fuel,double price) {  
	          
	        this();  
	        this.Carname = Carname;  
	        this.model = model;  
	        this.fuel = fuel;  
	        this.price = price;  
	    }  
	      
	  public void print(){  
	          
	        System.out.println(Carname+"\t"+model+"\t"+price+"\t"+fuel);  
	   }  
	  
	    public Prototype getClone() {  
	          
	        return new CarsConcreteclass(Carname,model,fuel,price);  
	    }
	    
	    
}