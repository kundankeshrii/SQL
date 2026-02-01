class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int[] rest = Arrays.copyOfRange(nums, 1, n);
        Arrays.sort(rest);
        return nums[0] + rest[0] + rest[1];
    }
}
