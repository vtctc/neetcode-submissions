class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            int[] count= new int[26];
            char[] chars=strs[i].toCharArray();
            for(char aChar:chars) {
                count[aChar-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int k=0;k<count.length;k++) {
                sb.append("#").append(count[k]);
            }
            map.putIfAbsent(sb.toString(),new ArrayList<>());
            map.get(sb.toString()).add(strs[i]);
        }
        return map.values().stream().toList();
    }
}
