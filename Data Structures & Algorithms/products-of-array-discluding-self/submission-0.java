class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];//[1,2,4,6]
        output[0]=1;
        for(int i=1;i<nums.length;i++) {
            output[i]=nums[i-1]*output[i-1];
        }
        //output=[1,1,2,8]
        int right=1;
        for(int i=output.length-1;i>=0;i--) {
            output[i]=output[i]*right;
            right=right*nums[i];
        }
        return output;
    }
}  
