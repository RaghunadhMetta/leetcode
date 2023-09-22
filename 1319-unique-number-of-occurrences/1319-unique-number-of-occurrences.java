class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.merge(i ,1, (oldVal,newVal) -> oldVal+newVal);
        }

        Set<Integer> countSet = new HashSet<>(map.values());

        return map.size()==countSet.size();
    }
}