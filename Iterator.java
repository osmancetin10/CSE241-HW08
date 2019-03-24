package hw8;

public class Iterator<Type> {
	
	private int position = 0;
	 private Type[] arr;
	
	public Iterator() {
	
	
	}
		
    public boolean hasNext() {
    	if (position < arr.length)
            return true;
        else
            return false;
	}
    
    public Type next() {
    	if (this.hasNext())
            return arr[position++];
        else
            return null;
	}
        void remove() {
        	
        	arr[position]=null;
		}

}
