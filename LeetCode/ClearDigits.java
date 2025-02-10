class Solution {
    public String clearDigits(String s) {
        String sol = "";
        for (char c: s.toCharArray()) {
            if(Character.isDigit(c) && sol.length() > 0) {
                sol = sol.substring(0, sol.length()-1);
            } else {
                sol += c;
            }
        }
        return sol;
    }
}