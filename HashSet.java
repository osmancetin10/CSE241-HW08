package hw8;

public class HashSet<Type> implements Set<Type> {

	private Type[] arr;
	private Type[] temp;
	private int capacity;
	private int element_count;
	private Type get_element;
	
	public HashSet() { //default constructor
		
		element_count=0;
		capacity=5;
		arr= (Type[])new Object[capacity];
		
	}
	
	public HashSet(HashSet a) { //constructor that takes array
		
		int i;
		this.element_count=a.size();
		this.capacity=a.size()+5;
		this.arr= (Type[])new Object[capacity];
		for(i=0;i<element_count;i++) {
			
			this.arr[i]= (Type) a.get_element(i);
		}
		
	}
	
	Type get_element(int index) {
		
		return arr[index];
	}
		
	@Override
	public void add(Type element) {

		int i,control=0;
		for(i=0;i<element_count;i++) {
			
			if(arr[i]==element) control++;
		}
		
		if(control==0) {
		
			if( element_count != capacity ) {
				arr[element_count]=element;
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
				
				arr[element_count]=element;
				element_count++;
				
			}
		
		}
		
	}

	@Override
	public void addAll(Collection<Type> object) {

		int i;
		Type element;
		for(i=0;i<((HashSet) object).size();i++) {
			element = (Type) ((HashSet) object).get_element(i);
			this.add(element);
		}
		
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
	public boolean contains(Type element) {
		int i;
		for(i=0;i<element_count;i++) {
			if(arr[i]==element) return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(element_count==0) return true;
		return false;
	}

	@Override
	public void remove(Type element) {
		
		int i ,index = -1;
		for(i=0;i<element_count;i++) {
			
			if(arr[i]==element) index=i;
		}
		if(index != -1) {
			for(i=index;i<element_count-1;i++) {
				
				arr[i]=arr[i+1];
			}
			element_count--;
		}
		
	}

	@Override
	public boolean containsAll(Collection<Type> object) {
		
		int i,control=0;
		Type element;
		boolean value;
		for(i=0;i<((HashSet) object).size();i++) {
			
			element = (Type) ((HashSet) object).get_element(i);
			value=this.contains(element);
			if(value==true) control++;
			
		}
		
		if(control==((HashSet) object).size()) return true;
		return false;
	}

	@Override
	public void removeAll(Collection<Type> object) {

		int i;
		Type element;
		for(i=0;i<((HashSet) object).size();i++) {
			element = (Type) ((HashSet) object).get_element(i);
			this.remove(element);
		}
		
	}

	@Override
	public int size() {
		
		return element_count;
	}

	@Override
	public void retainAll(Collection<Type> object) {

		int i,j,control=0;
		for(i=0;i<this.size();i++) {
			control=0;
			for(j=0;j<object.size();i++) {
				if(this.arr[i]==(Type) ((HashSet) object).get_element(j)) control++;
			}
			
			if(control==0) this.remove(this.arr[i]);
		}
		
	}
	

}
