package structural_Adapter;

public class AdapterPattern {
	public static void main(String args[]){  
		  Movieticket targetInterface=new MovieCustomers();  
		  targetInterface.giveTicketDetails();  
		  System.out.print(targetInterface.getMovieticket());  
		 }   

}
