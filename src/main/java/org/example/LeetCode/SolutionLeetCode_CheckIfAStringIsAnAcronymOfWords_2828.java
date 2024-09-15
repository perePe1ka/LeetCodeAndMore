package org.example.LeetCode;

import java.util.List;

public class SolutionLeetCode_CheckIfAStringIsAnAcronymOfWords_2828 {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            stringBuilder.append(words.get(i).charAt(0));
        }

        if (stringBuilder.toString().equalsIgnoreCase(s)) {
            return true;
        } else {
            return false;
        }
    }
}