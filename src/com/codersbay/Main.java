package com.codersbay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] unsorted = {2, 26, -12, 103};
        int[] sorted = new int[unsorted.length];

        for (int i = 0; i < unsorted.length; i++) {
            System.out.format("[%2d]   ", unsorted[i]);
        }

        for (int i = unsorted.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j + 1];
                    unsorted[j + 1] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }

        System.out.println();

        ArrayList<Integer> numbList = new ArrayList<>();

        for (int i = 0; i < unsorted.length; i++) {
            System.out.format("[%2d]   ", unsorted[i]);
            sorted[i] = unsorted[i];
        }

        System.out.println("\nSortierung beendet!");

    }
}
