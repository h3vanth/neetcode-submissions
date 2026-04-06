class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new LinkedList<>();
        Set<Integer> addedIndexes = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> anagrams = new LinkedList<>();
            if (addedIndexes.contains(i)) continue;
            anagrams.add(strs[i]);
            groupedAnagrams.add(anagrams);
            for (int j = i + 1; j < strs.length; j++) {
                if (addedIndexes.contains(j)) continue;
                char[] s1 = strs[i].toCharArray();
                char[] s2 = strs[j].toCharArray();
                Arrays.sort(s1);
                Arrays.sort(s2);
                String sortedS1 = String.valueOf(s1);
                String sortedS2 = String.valueOf(s2);
                if (sortedS1.equals(sortedS2)) {
                    anagrams.add(strs[j]);
                    addedIndexes.add(j);
                }
            }
        }
        return groupedAnagrams;
    }
}
