class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            String str = "";
            char ch;
            String single = words[i];
            for(int j = 0; j < single.length(); j++){
                ch = single.charAt(j);
                str = ch + str;
            }
            if(words[i].equals(str)){
                return words[i];

            }
        }
        return "";
    }
}
