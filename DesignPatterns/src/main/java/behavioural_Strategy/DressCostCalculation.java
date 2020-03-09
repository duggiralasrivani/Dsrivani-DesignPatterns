package behavioural_Strategy;

public class DressCostCalculation implements Strategy_interface{
    public int tot_price(int cost, int discount) { 
    int bill;
	bill= cost-(cost*discount/100);
    return bill;
	
}
}
