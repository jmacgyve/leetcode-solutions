package com.jmacgyve.problems.easy.validAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        setMapOfCharacterInterger(s, map1);
        setMapOfCharacterInterger(t, map2);

        return map1.equals(map2);
    }

    private void setMapOfCharacterInterger(String t, Map<Character, Integer> map2) {
        IntStream.range(0, t.length()).boxed()
                .forEach(idx ->
                {
                    if (!map2.containsKey(t.charAt(idx))) {
                        map2.put(t.charAt(idx), 1);
                    } else {
                        map2.put(t.charAt(idx), map2.get(t.charAt(idx)) + 1);
                    }
                });
    }
}
