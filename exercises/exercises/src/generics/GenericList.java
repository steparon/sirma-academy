package generics;

import java.util.Arrays;


public class GenericList<T extends Comparable<T>> {

    public static final int INITIAL_CAPACITY = 5;
    private T[] elements;
    private int size;
    private int capacity;

    public GenericList() {
        elements = (T[]) new Comparable[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        size = 0;
    }

    private void ensureCapacity() {
        T[] newArr = Arrays.copyOf(this.elements, this.capacity * 2);
        this.elements = newArr;
        this.capacity *= 2;
    }

    public void add(T element) {
            ensureCapacity();
            elements[size] = element;
            size++;
    }

    public Object get(int index) {
        return elements[index];
    }

    public boolean contains(T element) {
        for (T e : elements) {
            if (element == e) {
                return true;
            }
        }
        return false;
    }


    public void swap(int firstIndex, int secondIndex) {
        Object e = elements[firstIndex];
        elements[firstIndex] = elements[secondIndex];
        elements[secondIndex] = (T) e;
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T e : elements) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return 0;
    }


    public T getMax() {
        if (size == 0) {
            return null;
        }
        T max = elements[0];
        for (int i = 1; i < size; i++) {
            if (elements[i].compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }


  public T getMin() {
    if (size == 0) {
         return null;
     }
     T min = elements[0];
     for (int i = 1; i < size; i++) {
         if (elements[i].compareTo(min) < 0) {
             min = elements[i];
         }
     }
     return min;
 }

    public void print() {
        for (T element : elements) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }
}
