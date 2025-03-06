class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] times = new int[n * n + 1];

        for (int[] i: grid) {
            for (int k: i) {
                times[k]++;
            }
        }
        int repeated = 0, missing = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] == 2) {
                repeated = i;
            } else if (times[i] == 0){
                missing = i;
            }
        }
        return new int[]{repeated, missing};
    }
}