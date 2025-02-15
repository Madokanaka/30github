class ProductOfNumbers {
    ArrayList<Integer> list;

    public ProductOfNumbers() {
        list = new ArrayList();
        list.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            list = new ArrayList<>();
            list.add(1);
            return;
        }
        list.add(list.get(list.size() - 1) * num);
    }

    public int getProduct(int k) {
        if (k > list.size() - 1) {
            return 0;
        } else {
        return list.get(list.size() - 1 ) / list.get(list.size() - 1 - k);

        }

    }
}