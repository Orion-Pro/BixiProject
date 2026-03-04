package Model.linkedList;

public interface List<T> {
    public void push(T item);
    public T removeFromBack();
    public boolean isEmpty();
    public int size();
}
