package com.example.mopm2;
import java.util.ArrayList;
import java.util.List;

//Сортування злиттям
public class MergeSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        ArrayList<Integer> array = new ArrayList<>(input);
        mergeSort(array, 0, array.size() - 1);
        return array;
    }

    private void mergeSort(ArrayList<Integer> array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(ArrayList<Integer> array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Integer> leftArray = new ArrayList<>(array.subList(left, left + n1));
        List<Integer> rightArray = new ArrayList<>(array.subList(mid + 1, mid + 1 + n2));

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray.get(i) <= rightArray.get(j)) {
                array.set(k, leftArray.get(i));
                i++;
            } else {
                array.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            array.set(k, leftArray.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            array.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }
}
