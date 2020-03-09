package behavioural_Strategy;

public class SandalsCostCalculation implements Strategy_interface{
    public int tot_price(int cost, int discount) { 
    int bill;
    int Gst=410;
	bill= cost-(cost*discount/100)+Gst;
    return bill;
	
}
	

}
