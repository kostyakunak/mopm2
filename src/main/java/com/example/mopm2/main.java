package com.example.mopm2;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        for (int count : new int[]{10, 1000, 10000, 1000000}) {
            System.out.println("Число елементів: " + count);
            ArrayList<Integer> array = ArrayGenerator.generateArray(count, count);

            for (SortingType type : SortingType.values()) {
                System.out.println("Вид сортування: " + type);
                Sorter sorter = SorterClass.getSorter(type);
                Time.time(array, sorter);
                System.out.println();
            }
        }
    }
}
