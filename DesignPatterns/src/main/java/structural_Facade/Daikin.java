package structural_Facade;

public class Daikin implements AC_company{

	public void modelNo() {  
        System.out.println("Model name : Daikin");  
    }  
	public void warrenty() {  
	    System.out.println("Warrenty : 1 year on product, 1 year on condenser, 10 years on compressor");  
	    }  
    public void price() {  
    System.out.println("Price : Rs 48000.00");  
    }  
}
