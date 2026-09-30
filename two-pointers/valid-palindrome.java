class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String st=new StringBuilder(s).reverse().toString();
        if(st.equals(s)){
            return true;
        }else{
            return false;
        }
        
    }
}