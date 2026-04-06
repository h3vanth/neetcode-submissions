class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> kFrequentNumbers = new LinkedList<>();
        java.util.Arrays.stream(nums).mapToObj(i -> i).collect(Collectors.groupingBy(java.util.function.Function.identity(), LinkedHashMap::new, Collectors.counting()))
        .entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).limit(k).forEach(entry -> {
            kFrequentNumbers.add(entry.getKey());
        });
        int[] outputArray = new int[k];
        for (int i = 0; i < k; i++) {
            outputArray[i] = kFrequentNumbers.get(i);
        }
        return outputArray;
    }
}
