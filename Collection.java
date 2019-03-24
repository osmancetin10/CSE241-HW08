package hw8;

public interface Collection<Type> {

	public void add(Type element);
	public void addAll(Collection<Type> object);
	public void clear();
	public boolean contains(Type element);
	public boolean isEmpty();
	public void remove(Type element);
	public boolean containsAll(Collection<Type> object );
	public void removeAll(Collection<Type> object);
	public int size();
	public void retainAll(Collection<Type> object);
}
