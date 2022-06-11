class Solution {
    public int countHillValley(int[] nums) {
       if (nums == null || nums.length <= 2) return 0;
        int left = nums[0], count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((left > nums[i] && nums[i+1] > nums[i]) || (left < nums[i] && nums[i+1] < nums[i])) {
                count++;
                left = nums[i];
            }
        }
        return count;
    }
}