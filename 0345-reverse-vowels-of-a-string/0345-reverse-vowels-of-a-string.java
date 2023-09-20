class Solution {
    public static String vowels = "AEIOUaeiou";
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        char temp;
        while(i<=j){
            if(isVowel(s.charAt(i)) && 
                isVowel(s.charAt(j))){
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
            }
            else if(!isVowel(s.charAt(i))){
                i++;
            } else if(!isVowel(s.charAt(j))){
                j--;
            }
        }
        return new String(ch);
    }

    private boolean isVowel(char ch){
        return vowels.indexOf(ch) != -1;
    }
}