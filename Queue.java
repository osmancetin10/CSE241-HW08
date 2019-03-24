package hw8;

public interface Queue<Type> extends Collection<Type> {
	
	public Type element();
	public void offer(Type element);
	public Type poll();
}
