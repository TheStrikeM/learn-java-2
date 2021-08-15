package com.thestrikem;
import java.util.*;

public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Integer[] spam = new Integer[] { 1, 2, 2, 3, 4, 5, 5, 6 };
//        List<Integer> spamArray = new ArrayList();
//        spamArray.addAll(List.of(spam));
//
//        List<Integer> sortedArray = TaskManager.sortArray(spamArray);
//
//        System.out.println(sortedArray);

        int lastTwoMinNumberInInputs = TaskManager.getTwoMinNumberInInputs();
        System.out.println(lastTwoMinNumberInInputs);
    }

    public static int calculateValuesInConsole(Scanner sc) {
        List<Integer> numbers = new ArrayList();

        while(true) {
            String inputValue = sc.nextLine();
            if (inputValue.equals("ENTER")) break;
            numbers.add(Integer.parseInt(inputValue));
        }

        int finalResult = 0;
        for (int item = 0; item < numbers.toArray().length; item++) {
            finalResult += numbers.get(item);
        }

        return finalResult;
    }

    public static boolean isValidNumber(String numbers) {
        return numbers.matches("\\d+");
    }

    public static List<Integer> sortArray(List<Integer> numbers) {
        List<Integer> sortedNumbersArray = new ArrayList();
        sortedNumbersArray.addAll(numbers);

        for (int item = 0; item < sortedNumbersArray.toArray().length; item++) {
            for (int subItem = 0; subItem < sortedNumbersArray.toArray().length; subItem++) {
                if (item == subItem) continue;
                if (sortedNumbersArray.get(item).equals(sortedNumbersArray.get(subItem))) {
                    System.out.println("Number of " + sortedNumbersArray.get(subItem));
                    sortedNumbersArray.remove(item);
                }
            }
        }
        System.out.println(sortedNumbersArray);
        return sortedNumbersArray;
    }

    public static int getTwoMinNumberInInputs() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList();

        while(true) {
            String inputValue = sc.nextLine();
            if (!inputValue.matches("\\d+")) break;
            numbers.add(Integer.parseInt(inputValue));
        }

        List<Integer> sortedNumbers = new ArrayList();
        sortedNumbers.addAll(numbers);

        for (int item = 0; item < sortedNumbers.toArray().length; item++) {
            for (int subItem = 0; subItem < sortedNumbers.toArray().length; subItem++) {
                if (item == subItem) continue;
                if (sortedNumbers.get(item).equals(sortedNumbers.get(subItem))) {
                    sortedNumbers.remove(item);
                }
            }
        }

        sortedNumbers.remove(sortedNumbers.indexOf(sortedNumbers.stream().min(Integer::compare).get()));
        return sortedNumbers.stream().min(Integer::compare).get();
    }
}
