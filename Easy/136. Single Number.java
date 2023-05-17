//First Approch :-
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
       return nums[nums.length-1];
    }
}

//Second Approch :-
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = c ^ nums[i];
        }
        return c;
    }
}
