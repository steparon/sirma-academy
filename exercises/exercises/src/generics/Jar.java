package generics;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<T>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T remove() {
        return elements.pop();
    }
}
