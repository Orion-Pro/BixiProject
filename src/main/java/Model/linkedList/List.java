package Model.linkedList;

public interface List<T> {
    public void push(T item);
    public T pop();
    public boolean isEmpty();
    public int size();
}
