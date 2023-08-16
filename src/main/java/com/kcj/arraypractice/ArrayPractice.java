package com.kcj.arraypractice;

/**
 *
 * @author Kalil
 */

/* did not add a custom method meant to check any IllegalArgumentException's within a 
method to reduce reduancy for the same conditional statements */
public class ArrayPractice {

    public static void main(String[] args) {
        // test here
    }

    public static int getLastIndex(String[] names) {
        if (names.length == 0) {
            throw new IllegalArgumentException("String array passed to \"getLastIndex\" method cannot be empty.");
        }
        /* since indexes for data structures in most programming languages begin at 0, obtaining the last 
        index must be accounted for and cannot equal the actual length of the array*/
        return names.length - 1;
    }

    public static int getSecondToLastIndex(String[] names) {
        if (names.length == 0) {
            throw new IllegalArgumentException("String array passed to \"getSecondToLastIndex\" method cannot be empty.");
        }
        if (names.length == 1) {
            throw new IllegalArgumentException("String array's length passed to \"getSecondToLastElement\" method must be greater than 1");
        }
        /* since indexes for data structures in most programming languages begin at 0, obtaining the second to last 
        index must be accounted for*/
        return names.length - 2;
    }

    public static String getFirstElement(String[] names) {
        if (names.length == 0) {
            throw new IllegalArgumentException("String array passed to \"getFirstElement\" method cannot be empty.");
        }
        // first element starts at index 0
        return names[0];
    }

    public static String getLastElement(String[] names) {
        if (names.length == 0) {
            throw new IllegalArgumentException("String array passed to \"getLastElement\" method cannot be empty.");
        }
        return names[names.length - 1];
    }

    public static String getSecondToLastElement(String[] names) {
        if (names.length == 0) {
            return "String array passed to \"getSecondToLastElement\" method cannot be empty.";
        }
        if (names.length == 1) {
            return "String array's length passed to \"getSecondToLastElement\" method must be greater 1";
        }
        return names[names.length - 2];
    }

    public static int getSum(int[] ints) {
        if (ints.length == 0) {
            throw new IllegalArgumentException("array passed to \"getSum\" method cannot be empty");
        }
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    public static int getAverage(int[] ints) {
        if (ints.length == 0) {
            throw new IllegalArgumentException("array passed to \"getAverage\" method cannot be empty");
        }
        double average = 0;
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        if (sum != 0) {
            // times 1.0 to sum or ints.length for accurate double value
            average = 1.0 * sum / ints.length;
            return (int) average;
        }
        throw new IllegalArgumentException("sum of int array cannot equal 0");
    }

    public static String extractAllOddNumbers(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("int array passed to \"extractAllOddNumbers\" method cannot be empty.");
        }
        StringBuilder b = new StringBuilder();
        for (int i : numbers) {
            if (i % 2 != 0) {
                if (b.length() > 0) {
                    // use comma to separate valid numbers
                    b.append(", ");
                }
                b.append(i);
            }

        }
        if (b.toString().isEmpty()) {
            throw new IllegalArgumentException("No odd numbers found in array passed to \"extractAllOddNumbers\" method.");
        }
        return b.toString();
    }

    public static String extractAllEvenNumbers(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("int array passed to \"extractAllEvenNumbers\" method cannot be empty.");
        }
        StringBuilder b = new StringBuilder();
        for (int i : numbers) {
            if (i % 2 == 0) {
                if (b.length() > 0) {
                    // use comma to separate valid numbers
                    b.append(", ");
                }
                b.append(i);
            }

        }
        if (b.toString().isEmpty()) {
            throw new IllegalArgumentException("No even numbers found in array passed to \"extractAllEvenNumbers\" method.");
        }
        return b.toString();
    }

    public static boolean contains(String[] names, String element) {
        if (names.length == 0) {
            throw new IllegalArgumentException("String array passed to \"contains\" method cannot be empty.");
        }
        if (element.isEmpty() || element.isBlank()) {
            throw new IllegalArgumentException("String element passed to \"contains\" method cannot be empty or blank.");
        }
        for (String name : names) {
            if (name.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndexByElement(String[] names, String element) {
        if (names.length == 0) {
            throw new IllegalArgumentException("String array passed to \"getIndexByElement\" method cannot be empty.");
        }
        if (element.isEmpty() || element.isBlank()) {
            throw new IllegalArgumentException("String element passed to \"getIndexByElement\" method cannot be empty or blank.");
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Element not located in array.");
    }

    public static void printOddNumbersInRange(int start, int end) {
        // check if start and end = 0
        if (start == 0 && end == 0) {
            throw new IllegalArgumentException("Both start and end are 0");
        }

        // check if end number is not less than start number
        if (end < start) {
            throw new IllegalArgumentException("end number cannot be greater than start number");
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static String printGivenStringTimesNumberGiven(String str, int n) {
        if (str.isEmpty() || str.isBlank()) {
            throw new IllegalArgumentException("String passed to \"printGivenStringTimesNumberGiven\" method cannot be empty or blank.");
        }
        if (n < 0) {
            throw new IllegalArgumentException("int count passed to \"repeatFirstThreeLetters\" method cannot be less than zero.");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
        return str;
    }

    public static String repeatFirstThreeLetters(String str, int n) {
        if (str.isEmpty() || str.isBlank()) {
            throw new IllegalArgumentException("String passed to \"repeatFirstThreeLetters\" method cannot be empty or blank.");
        }
        if (n < 0) {
            throw new IllegalArgumentException("int count passed to \"repeatFirstThreeLetters\" method cannot be less than zero.");
        }
        // use StringBuilder to append letters
        StringBuilder b = new StringBuilder();
        // find letters using for-loop
        for (int i = 0; i < str.length(); i++) {
            // if b's letter length becomes greater than 2, then break
            if (b.length() > 2) {
                break;
            }
            // check if characters are actually letters and not symbols or numbers
            if (/*!Character.isDigit(str.charAt(i)) && */ Character.isLetter(str.charAt(i))) {
                b.append(str.charAt(i));
            }

        }
        // make it easier to identify the three letters
        String firstThree = b.toString();

        // second check to make sure firstThree is actually three letters
        if (firstThree.length() > 2) {
            // print firstThree letters as many times as n equals
            for (int i = 0; i < n; i++) {
                System.out.println(firstThree);
            }
            return firstThree;
        } else {
            throw new IllegalArgumentException("String passed to \"repeatFirstThreeLetters\" does not contain three letters.");
        }

    }

// Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str) {
        if (str.isEmpty() || str.isBlank()) {
            throw new IllegalArgumentException("String passed to \"WordsInAStringCounter\" method cannot be empty or blank.");
        }
        // breaks up all parts of the given string by spaces into a String array
        String[] parts = str.split(" ");
        int wordLength = 0;

        /* acknowledges all possible symbols and numbers within each element of parts  
        that would prevent a word from being considered a word through a regular expression */
        String forbidden = ".*[0-9!@#$%^&*(),.?\\\":{}|<>'\\\\[\\\\]_+=/-].*";
        /* within forbidden, ".*" means zero or more occurences of the preceding element
        and matches any character expect for a newline character */
        
        for (String currentWord : parts) {
            if (!currentWord.matches(forbidden)) {
                // increment wordLength if currentWord does not contain numbers or symbols
                wordLength++;
            }
        }
        // get last word
        String lastWord = parts[parts.length - 1];

        // acknowledge if lastWord ends with ".", "!", "?" to be marked as a word
        String allowedSymbolsForLastWord = "[!.?]";
        if (parts[parts.length - 1].matches(".*" + allowedSymbolsForLastWord + ".*")
                && !lastWord.substring(0, lastWord.length() - 1).matches(forbidden)) {
            wordLength++;
        }
        return wordLength;
    }
}
