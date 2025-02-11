class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] counting = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counting[s.charAt(i) - 97] += 1;
            counting[t.charAt(i) - 97] -= 1;
        }

        for (int i: counting) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}