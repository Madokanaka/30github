class ParkingSystem {
    int[] nums;
    public ParkingSystem(int big, int medium, int small) {
        nums = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (nums[carType - 1] > 0) {
            nums[carType - 1]--;
            return true;
        } else {
            return false;
        }

    }
}