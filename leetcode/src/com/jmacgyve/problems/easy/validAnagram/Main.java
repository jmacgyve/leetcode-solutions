package com.jmacgyve.problems.easy.validAnagram;

public class Main {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("car", "rat"));
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("aabbbb", "aaaabb"));
    }
}
