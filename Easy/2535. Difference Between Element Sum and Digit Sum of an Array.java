class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digsum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];

            int n = nums[i];
            // int d = 0;
            while(n>0){
                int dig = n%10;
                digsum = dig + digsum;
                n/=10;
            }
        }
        return sum-digsum;
    }
}
