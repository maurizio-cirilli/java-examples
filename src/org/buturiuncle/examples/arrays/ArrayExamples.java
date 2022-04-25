package org.buturiuncle.examples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayExamples {

    public static void main(String[] args) {

        System.out.println("Start Main ArrayExamples");
        sortOneMillionArray();
        System.out.println("End Main ArrayExamples");
    }

    public static void sortOneMillionArray() {
        System.out.println("Start sortOneMillionArray");
        int N = 1000000;
        int[] a = new int[N];

        for (int j = N - 1; j > 0; j--) {
            a[j] = j;
        }
        Arrays.sort(a);
        Arrays.stream(a).forEach(System.out::println);
        System.out.println("End sortOneMillionArray");
    }
}
