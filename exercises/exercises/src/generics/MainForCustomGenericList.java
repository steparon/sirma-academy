package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainForCustomGenericList {
    public static void main(String[] args) {

        GenericList<String> list = new GenericList<>();
        //GenericList<Integer> list = new GenericList<>();
        //GenericList<Double> list = new GenericList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {

        String input = sc.nextLine();

        if (input.equalsIgnoreCase("end")) {
             break;
        }

        String[] command = input.split(" ");

        switch(command[0]) {
            case "Add":
                list.add(command[1]);
                break;
          /*  case "Max":
                System.out.println(list.getMax());
                break;
            case "Min":
                System.out.println(list.getMin());
                break; */
            case "Swap":
                int firstIndex = Integer.parseInt(command[1]);
                int secondIndex = Integer.parseInt(command[2]);
                list.swap(firstIndex, secondIndex);
                break;
            case "Contains":
                System.out.println(list.contains(command[1]));
                break;
            case "Print":
                list.print();
                break;
        }
        }
    }
}
