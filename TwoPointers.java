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
//2.(LC no:392)Is Subsequence:
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int con=0;
            boolean l=true;
            for(int i=0;i<s.length();i++){
                l=false;
                for(int j=con;j<t.length();j++){
                    if(s.charAt(i)==t.charAt(j)){
                        con=j+1;
                        l=true;
                        break;
                    }
                }if(l==false){
                    break;
                }
            }return l;
        }
    }