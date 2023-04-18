class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length <= 1){
            return arr.length;
        }
        int counter = 1;
        int n = arr.length;
        int lastNum = arr[0];
        for (int i = 1; i < n; i++) {
            if (lastNum != arr[i]) {
                lastNum = arr[i];
                arr[counter++] = lastNum;
            }
        }
        return counter;

    }
}
