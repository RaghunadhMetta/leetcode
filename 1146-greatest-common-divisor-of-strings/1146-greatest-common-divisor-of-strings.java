class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int gcdSize = 0;
        String expectedS1 = "";
        String expectedS2 = "";
        StringBuilder gcdString = new StringBuilder();
        for(int i=1;i<=Math.min(str1.length(),str2.length());i++){
            if(str1.length()%i==0 && str2.length()%i==0){
                gcdSize=i;
            }
        }
        
        for(int i=0;i<gcdSize;i++){

            if(str1.charAt(i)==str2.charAt(i)){
                gcdString.append(str1.charAt(i));
            }else{
                break;
            }
        }

        for(int i=0;i<str1.length()/gcdSize;i++){
            expectedS1 = expectedS1 +gcdString.toString();

        }
        if(!expectedS1.equals(str1)){
            return "";
        }

        for(int i=0;i<str2.length()/gcdSize;i++){
            expectedS2 = expectedS2 +gcdString.toString();

        }
        if(!expectedS2.equals(str2)){
            return "";
        }

        return gcdString.toString();
    }
}