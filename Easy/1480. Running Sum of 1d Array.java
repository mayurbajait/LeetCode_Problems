class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int arr [] = new int [n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                arr[i] = nums[j] + arr[i];
            }
        }
        return arr;
    }
}
