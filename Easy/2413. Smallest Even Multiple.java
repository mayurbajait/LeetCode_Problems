Single Line Approch
//class Solution {
//  public int smallestEvenMultiple(int n) {
//    return n * (n % 2 + 1);
//  }
//}

Second Approch
class Solution {
    public int smallestEvenMultiple(int n) {
        int i=2;
        while(true){
            if(i%n==0 && i%2 ==0){
                break;
            }
            i++;
        }
        return i;
    }
}
