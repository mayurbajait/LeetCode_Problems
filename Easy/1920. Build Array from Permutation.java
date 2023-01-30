class Solution {
    public int[] buildArray(int[] nums) {
        int bi [] = new int [nums.length];

        for(int i = 0; i < bi.length; i++){
            bi[i] = nums[nums[i]];
        }
        return bi;
    }
}
