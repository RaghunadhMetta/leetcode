class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length==1){
            return 0;
        }
        int sum =0;
        
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        int sl=0;
        for(int i=0;i<nums.length;i++){
            if(sl==sum-sl-nums[i]){
                return i;
            }
            sl = sl+nums[i];
        }
        
        return -1;
    }
}