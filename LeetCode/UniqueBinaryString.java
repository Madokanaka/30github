class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append((char) (nums[i].charAt(i) ^ 1));
        }
        return sb.toString();
    }
}