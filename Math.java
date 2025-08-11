//1.(LC no:66)Plus One:
    class Solution {
        public int[] plusOne(int[] digits) {
            int n=digits.length;
            for(int i=n-1;i>=0;i--){
                if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
                }
                digits[i]=0;
            }
            int[] r=new int[n+1];
            r[0]=1;
            return r;
        }
    }
//2.(LC no:172)Factorial Trailing Zeroes:
    class Solution {
        public int trailingZeroes(int n) {
            int val=0;
            while(n>0){
                n/=5;
                val+=n;
            }
            return val;
        }
    }