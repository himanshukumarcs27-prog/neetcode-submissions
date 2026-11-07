class Solution {
    public String mergeAlternately(String word1, String word2) {

        String result = "";
        int length1 = 0;
        int length2 = 0;

        while (length1 < word1.length() &&
               length2 < word2.length()) {

            result += word1.charAt(length1);
            result += word2.charAt(length2);

            length1++;
            length2++;
        }

        while (length1 < word1.length()) {
            result += word1.charAt(length1);
            length1++;
        }

        while (length2 < word2.length()) {
            result += word2.charAt(length2);
            length2++;
        }

        return result;
    }
}