class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sol = new HashMap<>();
        for (String str: strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String newWord = new String(ch);

            if (!sol.containsKey(newWord)) {
                sol.put(newWord, new ArrayList<>());
            }
            sol.get(newWord).add(str);
        }
        return new ArrayList<>(sol.values());
    }
}