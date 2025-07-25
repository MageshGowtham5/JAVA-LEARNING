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