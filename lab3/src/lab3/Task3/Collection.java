package lab3.Task3;

public interface Collection<E> {
    int size();

    boolean isEmpty();
    
    boolean contains(Object o);

    boolean add(Object o);

    boolean remove(Object o);

    void clear();
}