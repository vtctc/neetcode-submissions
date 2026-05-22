class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (left < right) {

            // Left side smaller
            if (height[left] < height[right]) {

                // Update left max
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                }

                // Trap water
                else {
                    water += leftMax - height[left];
                }

                left++;
            }

            // Right side smaller
            else {

                // Update right max
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                }

                // Trap water
                else {
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }
}
