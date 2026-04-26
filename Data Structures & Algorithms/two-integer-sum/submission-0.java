class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int r1= nums[i];
            int r2=target-r1;
            if(map.containsKey(r2)) {
                return new int[]{map.get(r2),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
