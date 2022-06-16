package com.jmacgyve.problems.easy.firstUniqueCharacter;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        int[] charCounts = new int[26]; //26 букв в английском алфавите
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
