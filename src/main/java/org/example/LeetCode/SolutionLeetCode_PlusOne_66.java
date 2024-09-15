package org.example.LeetCode;

import java.util.Arrays;
import java.util.OptionalInt;

public class SolutionLeetCode_PlusOne_66 {
    public int[] plusOneTest(int[] digits1) {
        OptionalInt lastDigit = Arrays.stream(digits1).reduce((a, a1) -> a1);
        lastDigit = OptionalInt.of(lastDigit.getAsInt() + 1);
        digits1[digits1.length-1] = lastDigit.getAsInt();


        return digits1;
    }

    public int[] plusOne(int[] digits2) {
        long newDigits = Long.parseLong(Arrays.stream(digits2)
                .mapToObj(String::valueOf)
                .reduce("",(str1,str2) -> str1 + str2));

        System.out.println(newDigits);
        newDigits +=1;

        int[] newArray = String.valueOf(newDigits).chars()
                .map(Character::getNumericValue)
                .toArray();

        for (long numbers1: newArray) {
            System.out.println("numbers1 = " + numbers1);
        }
        return newArray;
    }
}