class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int n = word1.length() + word2.length();
        // two pointers
        int i=0;
        int j=0;

        for(int k=0; k<n; k++){  // in a loop
            if (i<word1.length()){ // i adds  letter of first string
                result.append(word1.charAt(i));
                i++;
            }
            if (j<word2.length()){ // j adds letter of second string
                result.append(word2.charAt(j));
                j++;
            }
        }    
        return result.toString();
    }
}