package structural_Adapter;
import java.io.BufferedReader;  
import java.io.InputStreamReader; 
public class MovieCustomers extends TicketDetails implements Movieticket  {
	public void giveTicketDetails(){  
		  try{  
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		   System.out.print("Enter the movie name :");  
		   String mname=br.readLine();  
		   System.out.print("\n");  
		     
		   System.out.print("Enter the seat numbers:");  
		   String seatno=br.readLine();  
		   System.out.print("\n");  
		      
		   System.out.print("Enter the date  :");  
		   String date=br.readLine();  
		   
		   System.out.print("Enter the time  :");  
		    double time=Double.parseDouble(br.readLine());  
		   
		   setMovieName(mname);  
		   setSeatNum(seatno);  
		   setDate(date);  
		   setTime(time);  
		   }
		  catch(Exception e)
		  {  
		        e.printStackTrace();  
		  }  
		  }  
	
		  public String getMovieticket() {  	  
		   String MovieName=getMovieName(); 
		   String snum=getSeatNum();  
		   String d=getDate();  
		   double t=getTime();  
		         
		   return ("  THE MOVIE YOU BOOKED IS "+MovieName+" OF SEAT NUMBERS "+snum+" AT "+d+" "+t+" "+
		                      " IN PRASADS MULTIPLEX  ");  
		  }
		
}
