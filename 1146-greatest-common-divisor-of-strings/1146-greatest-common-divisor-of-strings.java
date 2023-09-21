class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //Decider to make your code run fast.
        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }
        int gcdSize = 0;
        int minLength = Math.min(str1.length(),str2.length());
        for(int i=1;i<=minLength;i++){
            if(str1.length()%i==0 && str2.length()%i==0){
                gcdSize=i;
            }
        }
        return str1.substring(0,gcdSize);
    }
}