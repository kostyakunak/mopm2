package com.example.mopm2;

import java.util.ArrayList;
import java.util.Random;

public class ArrayGenerator {
    public static ArrayList<Integer> generateArray(int size, int range) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(range + 1));
        }
        return array;
    }
}
