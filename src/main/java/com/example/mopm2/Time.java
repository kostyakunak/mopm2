package com.example.mopm2;
import java.util.ArrayList;

public class Time {
    public static void time(ArrayList<Integer> array, Sorter sorter) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> sortedArray = sorter.sort(new ArrayList<>(array)); //копія для збереження оригінального масиву
        long endTime = System.currentTimeMillis();

        System.out.println("Час сортування: " + (endTime - startTime) + " мс");
        System.out.println("Відсортований масив (перші 50 елементів): " + sortedArray.subList(0, Math.min(50, sortedArray.size())));
    }
}

