package behavioural_Iterator;

public class IteratorDemo {
public static void main(String args[])
{
	Names_iterator ni = new Names_iterator();  
     
     for(Iterator iter =ni.getIterator(); iter.hasNext();){  
         String food_items = (String)iter.next(); 
         System.out.println("----Food items in piki Restaurent----");  

         System.out.println("Menu: " + food_items);  
      }      
}  
}
