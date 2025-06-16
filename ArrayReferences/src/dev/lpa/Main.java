package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readInteger();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findmin(returnedArray);
        System.out.println(returnedMin);

    }


    private static int[] readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements seperated by commas:");
        String input = scanner.nextLine(); //Input is taken in the form of a string


        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findmin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
    private static void reverse(int[] array){
        int maxIndex = array.length;
        int halfLength = array.length/2;

        for (int i = 0;i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex-1];
            array[maxIndex-1] = temp;

        }
    }

}