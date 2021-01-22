package myPacke;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Array_List<Integer> list = new Array_List<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Item 4: " + list.get(4));
        System.out.println("Item 1: " + list.get(1));
        System.out.println("Item 2: " + list.get(2));

//        list.get(6);
//        System.out.println("Item: " + list.get(6));

        list.get(-1);
        System.out.println("Item 1-: " + list.get(-1));
    }
}
