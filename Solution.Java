class Solution {
    
    
    public int triangularSum(int[] nums) {
        for(int j = nums.length - 1; j > 0; j--) { //length decreased by 1 until 1
            for (int i = 0; i < j; i++) { // generate array in array for memory usage 
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
        }
        return nums[0];
    }
}
