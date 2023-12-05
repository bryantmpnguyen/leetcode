import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        // Using double pointer to reduce space usage since string can scale to a ton of chars

        if (s.length() == 1)
            return s;

        int start = 0;
        int end = s.length() - 1;

        char[] modifiedStr = new char[s.length()];

        while (start <= end) {
            while (start < end && !vowels.contains(s.charAt(start))) {
                modifiedStr[start] = s.charAt(start);
                start++;
            }

            while (start < end && !vowels.contains(s.charAt(end))) {
                modifiedStr[end] = s.charAt(end);
                end--;
            }
            
            modifiedStr[start] = s.charAt(end);
            modifiedStr[end] = s.charAt(start);
            start++;
            end--;

        }

        return new String(modifiedStr);

    }
}