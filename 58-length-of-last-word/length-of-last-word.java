class Solution {
    public int lengthOfLastWord(String s) {

        String[] sentence = s.split(" ");
        String lastWord = sentence[sentence.length - 1];

        return lastWord.length();
    }
} 