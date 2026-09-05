class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0 , next = 1,k = 0;
        while(next<nums.length && current<nums.length){
            if(nums[current]==nums[next]){
                next++;
            }
            else if(nums[current]!=nums[next]){
                nums[current+1] = nums[next];
                current++;
                k+=1;
                next++;
            }
            else{
                System.out.println("Wrong array");
            }
        }
        return k+1;
    }
}