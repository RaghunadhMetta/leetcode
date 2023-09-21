class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        for(int i=0;i<k;i++){
            sum = sum+nums[i];
        }
        double avg = sum/k;
        for(int i=1;i+k<=nums.length;i++){

            sum = sum - nums[i-1] + nums[i+k-1];
            avg = Math.max(avg,sum/k);
        }

        return avg;
        
    }
}