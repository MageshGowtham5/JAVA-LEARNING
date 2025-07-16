//1.(LC no:125)Valid Palindrome:
    class Solution {
        public boolean isPalindrome(String s) {
            s=s.toLowerCase().replaceAll("[^a-z0-9]","");
            int f=0,l=s.length()-1;
            while(f<l){
                if(s.charAt(f)!=s.charAt(l)){
                    return false;
                }
                f++;
                l--;
            }return true;
        }
    }