class Solution {
    public int commonFactors(int a, int b) {
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int ret = 0;
        for(int i = 1;i<=min;i++){
            if(min%i == 0 && max%i == 0){
                ret++;
            }
        }
        return ret;
    }
}
