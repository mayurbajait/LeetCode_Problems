class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int ans [] = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }
        int add = 0;
        for(int i = nums.length; i < ans.length; i++){
            ans[i] = nums[add];
            add++;
        }
        return ans;
    }
}
