class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            var left = i + 1;
            var right = nums.length - 1;
            while (left < right) {
                var sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    triplets.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return triplets;
    }
}
