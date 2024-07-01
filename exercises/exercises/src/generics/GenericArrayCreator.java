package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericArrayCreator<T> {

    private T[] arr;

    public GenericArrayCreator() {
    }

    public T[] create(int length, T item) {
        this.arr = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }
        return arr;
    }





    }


