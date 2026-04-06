class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        // [9,1,4,7,3,-1,0,5,8,-1,6]
        // [-1,-1,0,1,3,4,5,6,7,8,9]
        Arrays.sort(nums);
        int length = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else if (nums[i] + 1 == nums[i + 1]) {
                length++;
                if (max < length) {
                    max = length;
                }
            } else {
                if (max < length) {
                    max = length;
                }
                length = 1;
            }
        }
        return max;
    }
}
