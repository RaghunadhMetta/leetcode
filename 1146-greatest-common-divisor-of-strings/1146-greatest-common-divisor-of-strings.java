class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int gcdSize = 0;
        int minLength = Math.min(str1.length(),str2.length());

        String expectedS1 = "";
        String expectedS2 = "";
        for(int i=1;i<=minLength;i++){
            if(str1.length()%i==0 && str2.length()%i==0){
                gcdSize=i;
            }
        }
        // if(!str1.substring(0,gcdSize).equals(str2.substring(0,gcdSize))){
        //     return "";
        // }

        int s1Generator = str1.length()/gcdSize;
        int s2Generator = str2.length()/gcdSize;
        
        for(int i=0;i<s1Generator;i++){
            expectedS1 = expectedS1 +str1.substring(0,gcdSize);

        }
        if(!expectedS1.equals(str1)){
            return "";
        }

        for(int i=0;i<s2Generator;i++){
            expectedS2 = expectedS2 +str1.substring(0,gcdSize);

        }
        if(!expectedS2.equals(str2)){
            return "";
        }

        return str1.substring(0,gcdSize);
    }
}