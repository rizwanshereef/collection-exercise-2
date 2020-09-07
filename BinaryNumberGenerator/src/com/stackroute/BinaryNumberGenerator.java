package com.stackroute;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumberGenerator {
    /*Class to generate the binary number  series*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value:");
        int num = scan.nextInt();
        generatePrintBinary(num);
    }

    /*Method to generate the binary number of values 1 to N*/
    static void generatePrintBinary(int num) {
        if ((num > 0) && (num <= 20)) {
            Queue<String> queueObj = new LinkedList<String>();
            /*Add first element*/
            queueObj.add("1");
            int i = 1;
            while (i++ <= num) {
                /* print the front of queue */
                String strOne = queueObj.peek();
                queueObj.remove();
                System.out.print(strOne);
                System.out.print("\t");

                String strTwo = strOne;

                queueObj.add(strOne + "0");

                queueObj.add(strTwo + "1");
            }
        } else if (num > 20)
            System.out.println("Give proper input not greater than 20");
        else
            System.out.println("Give proper input not zero or negative");

    }
}
