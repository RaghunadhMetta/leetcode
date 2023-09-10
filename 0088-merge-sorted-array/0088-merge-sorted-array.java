class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arrEnd = m+n-1;
        while(arrEnd>=0) {
            if(m==0){
                nums1[arrEnd] = nums2[n-1];
                n=n-1;
            }else if(n==0){
                nums1[arrEnd] = nums1[m-1];
                m=m-1;
            }
            else if(nums1[m-1]>=nums2[n-1]){
                nums1[arrEnd] = nums1[m-1];
                m=m-1;
            }
             else if(nums1[m-1]<nums2[n-1]){
                nums1[arrEnd] = nums2[n-1];
                n=n-1;
            }
            arrEnd=arrEnd-1;
        }
    }
}