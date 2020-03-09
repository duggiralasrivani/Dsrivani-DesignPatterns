package behavioural_Iterator;

public class Names_iterator {
	
	public String food_items[] = {"soups","panner","panipuri","biryani","noodles","ice creams","milkshake"};
	
	public Iterator getIterator() {  
        return new food_itemsIterate() ;  
    }  
    private class food_itemsIterate implements Iterator{  
        int i;  
        public boolean hasNext() {  
            if (i<food_items.length){  
                return true;  
            }  
            return false;  
        }  
        public Object next() {  
            if(this.hasNext()){  
                return food_items[i++];  
            }  
            return null;      
        }  
    }  
}