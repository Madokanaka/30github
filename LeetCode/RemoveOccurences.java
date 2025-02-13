class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int ind = str.indexOf(part);
        while (ind != -1) {
            str.delete(ind, ind + part.length());
            ind = str.indexOf(part);
        }
        return str.toString();
    }
}