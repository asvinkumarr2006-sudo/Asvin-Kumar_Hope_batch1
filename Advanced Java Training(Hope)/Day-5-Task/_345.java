import java.util.*;

class Solution {

    public String reverseVowels(String s) {
        List<Character> chars = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char lower = Character.toLowerCase(s.charAt(i));
            if (
                lower == 'a' ||
                lower == 'e' ||
                lower == 'i' ||
                lower == 'o' ||
                lower == 'u'
            ) {
                chars.add(s.charAt(i));
                index.add(i);
            }
        }

        // Reverse the vowels, NOT the indices
        Collections.reverse(chars);

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < index.size(); i++) {
            sb.setCharAt(index.get(i), chars.get(i));
        }

        return sb.toString();
    }
}