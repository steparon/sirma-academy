package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountMethod <T extends Comparable<T>> implements Comparable<CountMethod<T>>{

    private T value;

    public CountMethod(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(CountMethod<T> other) {
        return this.value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return value.getClass().getName() + ": " + value;
    }

    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<CountMethod<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            list.add(new CountMethod<>(input));
        }

        String compareElement = sc.nextLine();

        CountMethod<String> compareItem = new CountMethod<>(compareElement);

        int count = countGreaterThan(list, compareItem);

        System.out.println(count);

        sc.close();
    }
}


