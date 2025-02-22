class Solution {
    public int scoreOfString(String s) {
        char[] letters = s.toCharArray();
        int st = 0;
        for (int i = 0; i < letters.length - 1; i++) {
            st += Math.abs(letters[i] - letters[i+1]);
        }
        return st;
    }
}