class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int minLen = Math.min(word1.length(),word2.length());
        int i =0;
        StringBuilder sb = new StringBuilder();
        while(i<minLen){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        String maxLenWord = word1.length()>word2.length()?
                            word1 :word2;
        sb.append(maxLenWord.substring(minLen,maxLenWord.length()));

        return sb.toString();
    }
}