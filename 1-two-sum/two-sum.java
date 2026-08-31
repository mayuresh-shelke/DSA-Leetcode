class Solution {
    //added to dsa repo
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        System.out.println("Target = " + target);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        for(int i = 0 ; i < nums.length ; i++){
            for (int j = nums.length-1 ; j > i ; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    //continue;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution sum = new Solution();
        int[] result = sum.twoSum(nums, target);
        System.out.println("\nResulted array: ");
        for(int i = 0 ; i<2 ; i++){
        System.out.print(result[i] + " ");
        }
    }
    //done
}

