package generics;

public interface MyList<E extends Comparable<E>> {

    void add(E elements);

    E get(int index);

    boolean contains(E element);

    void swap(int firstIndex, int secondIndex);

    int countGreaterThan(E element);

    E getMax();

    E getMin();


}
