package structural_Facade;

public class Company_customer {
	private AC_company LLoyd;  
    private AC_company OGeneral;  
    private AC_company Daikin;  
      
    public Company_customer(){  
        LLoyd= new LLoyd();  
        OGeneral=new OGeneral();  
        Daikin=new Daikin();  
    }  
    public void LLoydSale(){  
        LLoyd.modelNo();  
        LLoyd.price();  
    }  
        public void OGeneralSale(){  
        OGeneral.modelNo();  
        OGeneral.price();  
    }  
   public void DaikinSale(){  
    Daikin.modelNo();  
    Daikin.price();  
        }  
}
