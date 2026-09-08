class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j= 0,sum=0,length=Integer.MAX_VALUE;
        for (int i = 0; i<nums.length; i++) {    
            sum+=nums[i];       
            while(sum>=target){
                length = Math.min(length , i-j+1);
                sum-=nums[j++];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}