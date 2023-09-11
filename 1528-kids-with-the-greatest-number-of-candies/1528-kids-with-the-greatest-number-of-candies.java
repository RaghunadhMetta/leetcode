class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = candies[0];
        List<Boolean> result = new ArrayList<>();

        for(int i=1;i<candies.length;i++){
            if(maxCandies<candies[i]){
                maxCandies = candies[i];
            }
        }

        for(int i=0;i<candies.length;i++){
            
            result.add(candies[i]+extraCandies >= maxCandies);
        }
        return result;
        
    }
}