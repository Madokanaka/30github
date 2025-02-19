class Solution {
    int num;
    public String getHappyString(int n, int k) {
        num = n;
        StringBuilder sb = new StringBuilder();
        return build(sb, n, k);
    }

    public String build(StringBuilder sb, int n, int k) {
        if (n == 0)
            return sb.toString();
        for (char c = 'a'; c < 'd'; c++) {
            if (sb.length() > 0 && c == sb.charAt(sb.length() - 1))
                continue;
            int counter = (int) Math.pow(2, num - sb.length() - 1);
            if (counter >= k) {
                return build(sb.append(c), n - 1, k);
            } else {
                k -= counter;
            }
        }
        return "";
    }
}