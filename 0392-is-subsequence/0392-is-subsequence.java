class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length()>t.length()){
            return false;
        }

        int indexS = 0;
        int indexT = 0;

        while(indexS < s.length() && indexT < t.length()){
            if(s.charAt(indexS)== t.charAt(indexT)){
                indexS++;
            }
                indexT++;
        }

        if(indexS!=s.length()){
            return false;
        }else{
            return true;
        }
        
    }
}