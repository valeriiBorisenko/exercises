package se.lexicon;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

    public static void array () {
        int[] numbers = {11, 23, 31, 42, 54};

        for (int number : numbers ) {
            System.out.print(number);
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
            System.out.println("Write a number:");
            try {
                int number = scanner.nextInt();

                if (number > 0) {
                    numbers = combine(numbers, number);
                    System.out.println("Array: " + Arrays.toString(numbers));
                } else if (number == 0) {
                    isActive = false;
                } else {
                    System.out.println("Please enter a number:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error");
                scanner.next();
            }
        }
    }

    //-------------------------------------------------------------//

    public static void multiplicationTable () {
        int[] line = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] multiArray = new int[10][10];

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line.length; j++) {
                multiArray[i][j] = line[i] * line[j];
            }
        }

        for (int[] array: multiArray) {
            System.out.println(Arrays.toString(array));
        }
    }

    //-------------------------------------------------------------//

    public static void diagonalElements () {
        int[] arrayLine = {1, 2, 3};
        int[][] arrayNew = new int[3][3];

        for (int i = 0; i < arrayLine.length; i++) {
            for (int j = 0; j < arrayLine.length; j++) {
                arrayNew[i][j] = arrayLine[i] * arrayLine[j];
            }
        }
        for (int i = 0; i < arrayNew.length; i++) {
            for (int j = 0; j < arrayNew.length; j++) {
                if (i == j) {
                    System.out.println(arrayNew[i][i]);
                }
            }
        }

    }

    //-------------------------------------------------------------//

    public static void sortSpecCopy () {
        int[] numbers = {1, 2, 4, 5, 7, 8, 9, 10};
        int[] newNumbers = {};
        int[] evenNumbers = {};

        for (int number: numbers) {
            if (number % 2 != 0) {
                newNumbers = combine(newNumbers, number);
            } else {
                evenNumbers = combine(evenNumbers, number);
            }
        }

        for (int number: evenNumbers) {
            newNumbers = combine(newNumbers, number);
        }

        System.out.println(Arrays.toString(newNumbers));
    }
}
