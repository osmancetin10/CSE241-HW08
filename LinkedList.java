package hw8;

public class LinkedList<Type> implements List<Type>,Queue<Type> {

	private Type[] arr;
	private Type[] temp;
	private int capacity;
	private int element_count;
	private Type get_element;
	private Type head;
	
	
	public LinkedList() { //default constructor
		
		element_count=0;
		capacity=5;
		arr= (Type[])new Object[capacity];
		
	}
	
	public LinkedList(LinkedList a) { //constructor that takes array
		
		int i;
		this.element_count=a.size();
		this.capacity=a.size()+5;
		this.arr= (Type[])new Object[capacity];
		for(i=0;i<element_count;i++) {
			
			this.arr[i]= (Type) a.get_element(i);
		}
		
		this.head=this.arr[element_count-1];
				
	}


	@Override
	public void clear() {
		int i;
		for(i=0;i<element_count;i++) {
			
			arr[i]=null;
		}
		
		element_count=0;
		
	}


	@Override
	public boolean isEmpty() {
		if(element_count==0) return true;
		return false;
	}


	@Override
	public int size() {
		return element_count;
	}


	@Override
	public void add(Type element) {
		
		int i;
		if( element_count != capacity ) {
			
			for(i=element_count;i>0;i--) {
				arr[i]=arr[i-1];	
				
			}
			
			arr[0]=element;
			element_count++;
		}
		
		else {
			temp = (Type[])new Object[capacity];
			for(i=0;i<capacity;i++) {
				temp[i]=arr[i];
			}
			
			capacity+=5;
			arr = (Type[])new Object[capacity];
			
			for(i=0;i<element_count;i++) {
				arr[i]=temp[i];
			}
			
			for(i=element_count;i>0;i--) {
				arr[i]=arr[i-1];
				
			}
			arr[0]=element;
			element_count++;
			
			head=arr[element_count-1];
			
		}
		
		
		
	}


	@Override
	public void addAll(Collection<Type> object) {
		int i;
		Type element;
		for(i=0;i<((LinkedList) object).size();i++) {
			element = (Type) ((LinkedList) object).get_element(i);
			this.add(element);
		}
		
		this.head=this.arr[element_count-1];
	}


	@Override
	public boolean contains(Object element) {
		int i;
		for(i=0;i<element_count;i++) {
			if(arr[i]==element) return true;
		}
		return false;
	}


	@Override
	public void remove(Type element) {
		
		if(element==head) {
			arr[element_count-1]=null;
			element_count--;
			head=arr[element_count-1];
		}
				
	}


	@Override
	public boolean containsAll(Collection object) {
		int i,control=0;
		Type element;
		boolean value;
		for(i=0;i<((ArrayList) object).size();i++) {
			
			element = (Type) ((LinkedList) object).get_element(i);
			value=this.contains(element);
			if(value==true) control++;
			
		}
		
		if(control==((LinkedList) object).size()) return true;
		return false;
	}


	@Override
	public void removeAll(Collection<Type> object) {
		int i;
		Type element;
		for(i=0;i<((LinkedList) object).size();i++) {
			element = (Type) ((LinkedList) object).get_element(i);
			this.remove(element);
		}
		
	}


	@Override
	public void retainAll(Collection<Type> object) {
		int i,j,control=0;
		for(i=0;i<this.size();i++) {
			control=0;
			for(j=0;j<object.size();i++) {
				if(this.arr[i]==(Type) ((LinkedList) object).get_element(j)) control++;
			}
			
			if(control==0) this.remove(this.arr[i]);
		}
		
	}


	@Override
	public Type element() {
		
		return head;
	}


	@Override
	public void offer(Type element) {
		int i;
		if( element_count != capacity ) {
			
			for(i=element_count;i>0;i--) {
				arr[i]=arr[i-1];	
				
			}
			
			arr[0]=element;
			element_count++;
		}
		
		else {
			temp = (Type[])new Object[capacity];
			for(i=0;i<capacity;i++) {
				temp[i]=arr[i];
			}
			
			capacity+=5;
			arr = (Type[])new Object[capacity];
			
			for(i=0;i<element_count;i++) {
				arr[i]=temp[i];
			}
			
			for(i=element_count;i>0;i--) {
				arr[i]=arr[i-1];
				
			}
			arr[0]=element;
			element_count++;
			
			head=arr[element_count-1];
			
		}
		
		
	}


	@Override
	public Type poll() {
		
		//if(this.arr == null) throw new NullPointerException("This array is empty");
		Type value=this.head;
		this.remove(value);			
		return value;
	}

	public Type get_element(int index) {
		
		return arr[index];
	}

}
