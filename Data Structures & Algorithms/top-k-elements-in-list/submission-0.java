class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i:nums) {
            if(countMap.containsKey(i)) {
                int val = countMap.get(i);
                val = val + 1;
                countMap.put(i, val);
            } else {
                countMap.put(i,1);
            }
        }
        // Step 2: Bucket array
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : countMap.keySet()) {
            int freq = countMap.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Step 3: Collect top k
        List<Integer> result = new ArrayList<>();

        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        // Convert to array
        return result.stream().limit(k).mapToInt(i -> i).toArray();
    }
}
