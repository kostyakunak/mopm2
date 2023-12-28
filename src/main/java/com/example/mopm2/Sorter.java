package com.example.mopm2;
import java.util.ArrayList;

interface Sorter {
    ArrayList<Integer> sort(ArrayList<Integer> input);
}
enum SortingType {
    BUBBLE, SHELL, MERGE, QUICK
}