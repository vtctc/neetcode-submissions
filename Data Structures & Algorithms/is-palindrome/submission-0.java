class Solution {
    public boolean isPalindrome(String s) {
        int leftp=0;
        int rightp=s.length()-1;

        while(leftp<=rightp) {
            char chleft=s.charAt(leftp);
            char chright=s.charAt(rightp);
            //if left character is not digit then increment left
            if(!Character.isLetterOrDigit(chleft)) {
                leftp++;
                continue;
            }
            //if right character is not digit then increment right
            if(!Character.isLetterOrDigit(chright)) {
                rightp--;
                continue;
            }
            //else compare both the characters
            if(Character.toLowerCase(chleft)!=Character.toLowerCase(chright)) {
                return false;
            }
            else{
                leftp++;
                rightp--;
            }
        }
        return true;
    }
}
