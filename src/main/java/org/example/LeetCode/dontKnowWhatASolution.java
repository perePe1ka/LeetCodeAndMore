package org.example.LeetCode;

class dontKnowWhatASolution {
    public boolean halvesAreAlike(String s) {
        Character[] myGlasnie = new Character[]{'a', 'e', 'i', 'o', 'u'};
        int len1 = s.length() / 2;
        int len2 = len1 - len1;
        s = s.toLowerCase();
        String s1 = s.substring(0, len1);
        String s2 = s.substring(len1, s.length());

        int countS1 = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < myGlasnie.length; j++) {
                if (s1.charAt(i) == myGlasnie[j]) {
                    countS1 += 1;
                }
            }
        }

        int countS2 = 0;
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < myGlasnie.length; j++) {
                if (s2.charAt(i) == myGlasnie[j]) {
                    countS2 += 1;
                }
            }
        }

        if (countS1 == countS2) return true;
        return false;
    }
}