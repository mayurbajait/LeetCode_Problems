class Solution {
    public String defangIPaddr(String address) {
        String empty = "";
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                empty = empty + "[.]";
            }
            else{
                empty = empty + address.charAt(i);
            }
        }
        return empty;
    }
}
