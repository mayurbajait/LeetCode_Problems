class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length-1; i++){
            
        //     if(nums[i] == i){
                
        //     }
        //     else{
        //         return count;
        //     }
        // }
        // return -1;

        int res;
        int n = nums.length;
        res = n*(n+1)/2;
        int temp =0;
        for(int a:nums){
            temp+=a;
        }
        return res-temp;
    }
}
