class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String r1=new String(s1);
        String r2=new String(s2);
        
        return r1.equals(r2);
    }
}
