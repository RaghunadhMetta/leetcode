class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        int lengthToIterate = Integer.max(nums1.length,nums2.length);
        for(int i=0;i<lengthToIterate;i++){
            if(i<nums1.length){
                nums1Set.add(nums1[i]);
            }
            if(i<nums2.length){
                nums2Set.add(nums2[i]);
            }
        }


        for(int i=0;i<lengthToIterate;i++){
            if(i<nums1.length){
                nums1Set.add(nums1[i]);
            }
            if(i<nums2.length){
                nums2Set.add(nums2[i]);
            }
        }

        List<Integer> nums1Distinct = nums1Set.stream().filter(num ->   !nums2Set.contains(num))
        .collect(Collectors.toList());

        List<Integer> nums2Distinct = nums2Set.stream().filter( num -> !nums1Set.contains(num))
        .collect(Collectors.toList());;
        
        return Arrays.asList(nums1Distinct,nums2Distinct);


    }
}