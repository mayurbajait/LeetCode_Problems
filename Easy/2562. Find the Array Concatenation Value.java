class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int pointerOne = 0;
        int pointerTwo = nums.length - 1;

        long concat = 0;
            while (pointerOne <= pointerTwo) {
                String a = Integer.toString(nums[pointerOne]);
                String b = Integer.toString(nums[pointerTwo]);
                
                String sum = a + b;
                int ax = Integer.parseInt(a);
                int res = Integer.parseInt(sum);
                if(pointerOne == pointerTwo){
                    concat = concat + ax;
                }
                else{
                    concat = concat + res;
                }
                pointerOne++;
                pointerTwo--;
            }
            return concat;
    }
}
