/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.kcj.arraypractice;

import java.util.Arrays;

/**
 *
 * @author Kalil
 */
public class ArrayPractice {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] names = {"hi", "hello", "guy", "cool"};
        System.out.println(getLastIndex(names));
        System.out.println(getLastElement(names));
        printGivenStringTimesNumberGiven("dog", 3);
        String multipleString = "hi bye lets go guys";
        System.out.println("WordsInAStringCounter:");
        System.out.println(WordsInAStringCounter("hi guys today we. are! t&sting out WordsInAStringCounter method."));
        repeatFirstThreeLetters("h3o", 3);
        printOddNumbersInRange(3, 9);
        System.out.println(contains(names, "guyu"));
        int[] intArray = {3, 5, 6, 3, 7, 9, 2, 4};
        System.out.println(getAverage(intArray));
        System.out.println(extractAllOddNumbers(intArray));
        System.out.println(extractAllEvenNumbers(intArray));
        System.out.println(getSum(intArray));
        String[] checkIfOneString = {"hi"};
        getSecondToLastIndex(checkIfOneString);
    }

    public static int getLastIndex(String[] names) {
        if(names.length == 0) {
            System.out.println("String array passed to \"getLastIndex\" method cannot be empty.");
            return -1;
        }
        return names.length - 1;
    }

    public static int getSecondToLastIndex(String[] names) {
        if(names.length == 0) {
            System.out.println("String array passed to \"getSecondToLastIndex\" method cannot be empty.");
            return -1;
        }
        if(names.length == 1) {
             System.out.println("String array's length passed to \"getSecondToLastElement\" method must be greater than 1");
             return -1;
        }
        return names.length - 2;
    }

    public static String getFirstElement(String[] names) {
        if(names.length == 0) {
            System.out.println("String array passed to \"getFirstElement\" method cannot be empty.");
            return "";
        }
        return names[0];
    }

    public static String getLastElement(String[] names) {
        if(names.length == 0) {
            System.out.println("String array passed to \"getLastElement\" method cannot be empty.");
            return "";
        }
        return names[names.length - 1];
    }

    public static String getSecondToLastElement(String[] names) {
        if(names.length == 0) {
            return "String array passed to \"getSecondToLastElement\" method cannot be empty.";
        }
        if(names.length == 1) {
            return "String array's length passed to \"getSecondToLastElement\" method must be greater 1";
        }
        return names[names.length - 2];
    }

    public static int getSum(int[] ints) {
        if (ints.length == 0) {
            System.out.println("array passed to \"getSum\" method cannot be empty");
            return -1;
        }
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    public static int getAverage(int[] ints) {
        if (ints.length == 0) {
            System.out.println("array passed to \"getAverage\" method cannot be empty");
            return -1;
        }
        double average = 0;
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        if (sum != 0) {
            average = 1.0 * sum / ints.length;
            return (int) average;
        }
        System.out.println("Sum cannot be 0");
        return -1;
    }

    public static String extractAllOddNumbers(int[] numbers) {
        if(numbers.length == 0) {
            System.out.println("int array passed to \"extractAllOddNumbers\" method cannot be empty.");
            return "";
        }
        StringBuilder b = new StringBuilder();
        for (int i : numbers) {
            if (i % 2 != 0) {
                if (b.length() > 0) {
                    b.append(", ");
                }
                b.append(i);
            }

        }
        if (b.toString().isEmpty()) {
            System.out.println("No odd numbers found in array passed to \"extractAllOddNumbers\" method.");
            return "";
        }
        return b.toString();
    }

    public static String extractAllEvenNumbers(int[] numbers) {
        if(numbers.length == 0) {
            System.out.println("int array passed to \"extractAllEvenNumbers\" method cannot be empty.");
            return "";
        }
        StringBuilder b = new StringBuilder();
        for (int i : numbers) {
            if (i % 2 == 0) {
                if (b.length() > 0) {
                    b.append(", ");
                }
                b.append(i);
            }

        }
        if (b.toString().isEmpty()) {
            System.out.println("No even numbers found in array passed to \"extractAllEvenNumbers\" method.");
            return "";
        }
        return b.toString();
    }

    public static boolean contains(String[] names, String element) {
        if(names.length == 0) {
            System.out.println("String array passed to \"contains\" method cannot be empty.");
            return false;
        }
        if(element.isEmpty() || element.isBlank()) {
            System.out.println("String element passed to \"contains\" method cannot be empty or blank.");
            return false;
        }
        for (String name : names) {
            if (name.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndexByElement(String[] names, String element) {
        if(names.length == 0) {
            System.out.println("String array passed to \"getIndexByElement\" method cannot be empty.");
            return -1;
        }
        if(element.isEmpty() || element.isBlank()) {
            System.out.println("String element passed to \"getIndexByElement\" method cannot be empty or blank.");
            return -1;
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return i;
            }
        }
        System.out.println("Element not located in array.");
        return -1;
    }

    public static void printOddNumbersInRange(int start, int end) {
        if (start == 0 && end == 0) {
            System.out.println("Both start and end are 0");
            return;
        }
        if (end < start) {
            System.out.println("end number cannot be greater than start number");
            return;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static String printGivenStringTimesNumberGiven(String str, int n) {
        if (str.isEmpty() || str.isBlank()) {
            System.out.println("String passed to \"printGivenStringTimesNumberGiven\" method cannot be empty or blank.");
            return str;
        } 
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
        return str;
    }

    public static String repeatFirstThreeLetters(String str, int n) {
        if (str.isEmpty() || str.isBlank()) {
            System.out.println("String passed to \"repeatFirstThreeLetters\" method cannot be empty or blank.");
            return str;
        } 
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (b.toString().length() > 2) {
                break;
            }
            if (!Character.isDigit(str.charAt(i))) {
                b.append(str.charAt(i));
            }

        }
        String firstThree = b.toString();

        if (firstThree.length() > 2) {
            for (int i = 0; i < n; i++) {
                System.out.println(firstThree);
            }
            return firstThree;
        } else {
            System.out.println("String passed to \"repeatFirstThreeLetters\" does not contain three letters.");
            return str;
        }

    }

// Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str) {
        if (str.isEmpty() || str.isBlank()) {
            System.out.println("String passed to \"WordsInAStringCounter\" method cannot be empty or blank.");
            return 0;
        }
        String[] parts = str.split(" ");
        int wordLength = 0;
        String forbidden = ".*[0-9!@#$%^&*(),.?\\\":{}|<>'\\\\[\\\\]_+=/-].*";
        for(String i : parts) {
            if (!i.matches(forbidden)) {
                wordLength++;
            }
        }
        String lastWord = parts[parts.length - 1];
        if (parts[parts.length - 1].endsWith(".") 
                && !lastWord.substring(0, lastWord.length() - 2).matches(forbidden)) {
            wordLength++;
        }
        return wordLength;
    }
}
