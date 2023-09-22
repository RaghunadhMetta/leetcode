class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.merge(i ,1, (oldVal,newVal) -> oldVal+newVal);
        }
        List<Integer> countList =new ArrayList<>(map.values());
        Collections.sort(countList);

        for(int i=0;i<countList.size()-1;i++){
            if(countList.get(i) == countList.get(i+1)){
                return false;
            }

        }

        return true;

    }
}