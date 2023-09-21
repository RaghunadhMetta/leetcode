class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double avg = -100000.00;
        for(int i = 0;i<nums.length;i++){
            sum = sum +nums[i];
            if(i>=k-1){
            avg = Math.max(avg,sum/k);
            sum = sum - nums[i-k+1];

            }

        }
        
        return avg;
        
    }
}