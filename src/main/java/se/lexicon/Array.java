package se.lexicon;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

    public static void array () {
        int[] numbers = {11, 23, 31, 42, 54};

        for (int number : numbers ) {
            System.out.println(number);
        }
    }

    //-------------------------------------------------------------//

    public static void indexOf (int number) {
        int[] numbers = {2, 4, 5, 6, 8};
        int result = 0;

        for (int i = 0; i < numbers.length; i++ ) {
            boolean findNumber = numbers[i] == number;

            if (findNumber) {
                result = i;
                break;
            } else {
                result = -1;
            }
        }
        System.out.println("Index position of number " + number + " is: " + result);
    }

    //-------------------------------------------------------------//

    public static void sortString () {
        String[] cityArray = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(cityArray));
        Arrays.sort(cityArray);
        System.out.println("Sort string array: " + Arrays.toString(cityArray));
    }

    public static void copyArray () {
        int[] numbers = {1, 15, 20};
        System.out.println("Elements from first array: " + Arrays.toString(numbers));
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Elements from second array: " + Arrays.toString(copyNumbers));
    }

    //-------------------------------------------------------------//

    public static void twoDimensionalStringArray () {
        String[][] array = new String[2][2];

        array[0][0] = "France";
        array[0][1] = "Paris";
        array[1][0] = "Sweden";
        array[1][1] = "Stockholm";

        System.out.println(array[0][0] + " " + array[0][1]);
        System.out.println(array[1][0] + " " + array[1][1]);
    }

    //-------------------------------------------------------------//

    public static void averageArray () {
        int[] numbers = {45, 5, 23, 17, 2, 14};
        double number = 0;

        for (int j : numbers) {
            number += j;
        }

        System.out.println("Average is : " + number / numbers.length);
    }

    //-------------------------------------------------------------//

    public static void unevenNumbers () {
        int[] numbers = {1, 2, 4, 6, 7, 9, 10, 12, 13, 15};
        int[] unevenNumbers = {};

        for (int number : numbers) {
            if (number % 2 != 0) {
                unevenNumbers = combine(unevenNumbers, number);
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Odd array: " + Arrays.toString(unevenNumbers));
    }

    private static int[] combine (int[] array, int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1 ] = number;

        return newArray;
    }

    //-------------------------------------------------------------//

    public static void deleteDuplicate() {
        int[] numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[] newNumbers = {};

        for (int number : numbers) {
            if (Arrays.binarySearch(newNumbers, number) < 0) {
                newNumbers = combine(newNumbers, number);
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Array without duplicate values: " + Arrays.toString(newNumbers));

    }

    //-------------------------------------------------------------//

    public static void addElement () {
        int[] numbers = {};
        boolean isActive = true;
        Scanner scanner = new Scanner(System.in);

        while (isActive) {
            System.out.println("Write number:");
            try {
                int number = scanner.nextInt();

                if (number > 0) {
                    numbers = combine(numbers, number);
                    System.out.println("Array: " + Arrays.toString(numbers));
                } else if (number == 0) {
                    isActive = false;
                } else {
                    System.out.println("Please enter number");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error");
                scanner.next();
            }
        }
    }

}
