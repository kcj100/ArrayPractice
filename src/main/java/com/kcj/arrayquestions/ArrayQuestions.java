package com.kcj.arrayquestions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Kalil
 */

/* did not add a custom method meant to check any IllegalArgumentException's within a 
method to reduce reduancy for the same conditional statements */
    // main method is above question 16
public class ArrayQuestions {



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
            if (Character.isLetter(str.charAt(i))) {
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

        for (String currentWord : parts) {
            boolean currentWordIsWord = true;
            // check if each character of currentWord is a letter
            for (int i = 0; i < currentWord.length(); i++) {
                if (!Character.isLetter(currentWord.charAt(i))) {
                    // if not a letter, the word is automatically marked as not a word
                    // currentWordIsWord will equal false and for-loop to check currentWord will break
                    currentWordIsWord = false;
                    break;
                }
            }
            // if currentWordIsWord is not marked false by currentWord character checker for-loop,
            // currentWordIsWord remains true
            if (currentWordIsWord) {
                wordLength++;
            }
        }

        // get last word
        String lastWord = parts[parts.length - 1];

        // acknowledge if lastWord ends with ".", "!", "?" to be marked as a word
        String allowedSymbolsForLastWord = "[!.?]";
        /* ".*" means zero or more occurences of the preceding element
        and matches any character expect for a newline character */
        if (lastWord.matches(".*" + allowedSymbolsForLastWord + ".*")) {
            wordLength++;
        }
        return wordLength;
    }



    // Question 16
    // A, E, I, O, U, and sometimes Y
    public static int vowelsCounter(String str) {
        int vowelsCounter = 0;
        String vowels = "[aeiouyAEIOUY]";
        Pattern pattern = Pattern.compile(vowels);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if (matcher.matches()) {
                vowelsCounter++;
            }
        }
        return vowelsCounter;

    }

    // Question 17
    // Swap the first element in an array with the last element in an array and return
    public static String[] swap(String[] stringArray) {
        if (stringArray.length == 0) {
            System.out.println("Array is empty.");
            return stringArray;
        }
        String firstElement = stringArray[0];
        String lastElement = stringArray[stringArray.length - 1];
        stringArray[0] = lastElement;
        stringArray[stringArray.length - 1] = firstElement;
        return stringArray;
    }

    // Question 18

    /**
     * Given the following legend
     * <p>
     * <p>
     * <p>
     * f >> 7
     * <p>
     * s >> $
     * <p>
     * 1 >> !
     * <p>
     * a >> @
     * <p>
     * <p>
     * <p>
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * <p>
     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * <p>
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     * <p>
     * <p>
     * <p>
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */

    public static String replaceCharacters(String str) {
        String legend = "fs1aFS1A";
        String replacements = "7$!@7$!@";

        StringBuilder output = new StringBuilder();

        for (char c : str.toCharArray()) {
            int index = legend.indexOf(c);
            if (index != -1) {
                output.append(replacements.charAt(index));
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }

    // Question 19
    // " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] partsInput = stringInput.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < partsInput.length; i++) {
                if((i + 1) % 2 == 0) {
                    partsInput[i] = "Wu";
                } else if ((i + 1) % 3 == 0){
                    partsInput[i] = "Tang";
                }
        }
        for (String i : partsInput) {
            output.append(i).append(" ");
        }
        return output.toString();
    }

    // Question 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        StringBuilder output = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < maxnumber; i++) {
            if (counter == 0) {
                output.append(counter + ", ");
                counter++;
                output.append(counter + ", ");
            } else if (counter == 1){
                output.append(counter + ", ");
                counter++;
            } else {
                String[] parts = output.toString().split(", ");
                // take sum of last two numbers
                int temp = Integer.parseInt(parts[parts.length - 1]);
                int temp2 = Integer.parseInt(parts[parts.length - 2]);
                counter = temp + temp2;
                output.append(counter + ", ");
            }
        }
        return output.toString().substring(0, output.length() - 2);
    }

    public static void main(String[] args) {
        System.out.println("Question 16:\n" + vowelsCounter("supercalifragilisticexpialidocious"));
        System.out.println("Question 17:\n" + Arrays.toString(swap(new String[]{"hello" , "now", "turns", "into", "bye"})));
        System.out.println("Question 18:\n" + replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
        System.out.println("Question 19:\n" + replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println("Question 20:\n" + createStringOfFibonnaciUpToMax(20));
    }

}
