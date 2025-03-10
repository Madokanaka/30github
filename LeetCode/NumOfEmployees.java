class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int num = 0;
        for (int emp: hours) {
            if (emp >= target) num++;
        }
        return num;
    }
}