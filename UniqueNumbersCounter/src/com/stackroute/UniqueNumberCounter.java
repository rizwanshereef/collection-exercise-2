package com.stackroute;

import java.util.*;

public class UniqueNumberCounter {
    /*Main method to find the unique number count */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter elements into array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter size of sub array");
        int subArraySize = scanner.nextInt();
        findUniqueNumbersCount(numbers, subArraySize);
    }

    /*Method to find the maximum count of unique numbers in a given subArray length*/
    public static void findUniqueNumbersCount(int[] numbers, int subArraySize) {
        if (numbers.length == 0) {
            System.out.println("Give proper input not empty array");
        } else if (subArraySize < numbers.length) {
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < numbers.length; i++) {
                deque.add(numbers[i]);
            }
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (Collections.frequency(deque, numbers[i]) == 1) {
                    sum = sum + 1;
                }
            }
            System.out.println("Count of Unique Number is: " + sum);
        } else
            System.out.println(" subArray greater than array length");
    }

}
