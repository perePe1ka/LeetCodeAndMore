package org.example.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SolutionLeetCode_WordPattern_290 {
    public boolean wordPattern(String pattern, String s) {
        String[] arrayOfWords = s.split(" ");
        if (arrayOfWords.length != pattern.length()) return false;

        Map<Character, String> stringMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.toCharArray()[i];
            if (stringMap.containsKey(ch)) {
                if (!stringMap.get(ch).equals(arrayOfWords[i])) return false;
            } else {
                if (stringMap.containsValue(arrayOfWords[i])) return false;
                stringMap.put(ch, arrayOfWords[i]);
            }
        }

        System.out.println(stringMap.values());
        System.out.println(stringMap.keySet());
        return true;

    }
}