class Solution {
    int valueOf(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        return -1;
    }
    
    public int romanToInt(String s) {
        
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(valueOf(s.charAt(i)) < valueOf(s.charAt(i + 1))){
                sum -= valueOf(s.charAt(i));
            }
            else{
                sum += valueOf(s.charAt(i));
            }
        }
        sum += valueOf(s.charAt(s.length() - 1));
        return sum;
    }
}
