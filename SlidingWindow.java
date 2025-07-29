//1.(LC no:209)Minimum Size Subarray Sum:
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int min=Integer.MAX_VALUE;
            int left=0,sum=0;
            for(int right=0;right<nums.length;right++){
                sum+=nums[right];
                while(sum>=target){
                    if(min>=right-left+1){
                        min=right-left+1;
                    }
                    sum-=nums[left];
                    left++;
            }
            }return min==Integer.MAX_VALUE ? 0 :min;
        }
    }
//2.(LC no:3)Longest Substring Without Repeating Characters:
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> substring= new HashSet<>();
            int left=0,n=s.length(),max=0;
            for(int right=0;right<n;right++){
                if(!substring.contains(s.charAt(right))){
                    substring.add(s.charAt(right));
                    max=Math.max(max,right-left+1);
                }else{
                    while(substring.contains(s.charAt(right))){
                        substring.remove(s.charAt(left));
                        left++;
                    }
                    substring.add(s.charAt(right));
                }
            }return max;
        }
    }