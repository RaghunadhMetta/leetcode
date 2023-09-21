class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length==1){
            return 0;
        }
        int sum =0;
        
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        System.out.println(sum);
        int sr=sum,sl=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                sl=0;
                sr=sum-nums[i];
            }else if(i==nums.length-1){
                sl=sum-nums[i];
                sr=0;
            }else{
            sr=sr-nums[i];
            sl=sl+nums[i-1];
            }
            if(sl==sr){
                return i;
            }
        }
        
        return -1;
    }
}