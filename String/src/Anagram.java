
//  Anagram => Two Strings are anagrams if they contain the same characters with the same frequencies.

import java.util.Arrays;

public class Anagram {
    static void main(String[] args) {

        char[] a = "listen".toCharArray();
        char[] b = "silent".toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b));
    }
}
