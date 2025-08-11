class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase();
        String cleanedS = newS.replaceAll("[^A-Za-z0-9]","");
        int start = 0;
        int end = cleanedS.length()-1;
        while(start < end){
            if(cleanedS.charAt(start) != cleanedS.charAt(end)){
                return false;
            }
            start++;
            end--;  
        }
        return true;     
    }
}