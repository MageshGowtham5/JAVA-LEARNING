//Array or String (LC-Leet Code Number)

//1.(LC no:88)Merge Sorted Array:
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = m, j = 0; i < m + n; i++) {
                nums1[i] = nums2[j];
                j++;
            }
            Arrays.sort(nums1);
        }
    }

//2.(LC no:27)Remove Element:
    class Solution {
        public int removeElement(int[] nums, int val) {
            int index=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[index]=nums[i];
                    index++;
            }
            }return index;
        }
    }

//3.(LC no:26)Remove Duplicates from Sorted Array:
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j=1;
            for(int i=1;i<nums.length;i++){
                if(nums[j-1]!=nums[i]){
                    nums[j]=nums[i];
                    j++;
                }
            }return j;
        }
    }

//4.(LC no:80)Remove Duplicates from Sorted Array II:
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j=1,count=0;
            for(int i=1;i<nums.length;i++){
                if(nums[j-1]==nums[i] && count<j){
                    nums[j]=nums[i];
                    j++;
                    count=j;
                }else if(nums[j-1]!=nums[i]){
                    nums[j]=nums[i];
                    j++;
                }
            }
            return j;
        }
    }

//5.(LC no:169)Majority Element:
    class Solution {
        public int majorityElement(int[] nums) {
            int l=nums.length/2,count=0,val=0;
            for(int i=0;i<nums.length;i++){
                if(val!=nums[i]){
                    val=nums[i];
                    count=0;
                    for(int j=i;j<nums.length;j++){
                        if(val==nums[j]){
                            count+=1;
                            if(count>l){
                                return nums[j];
                            }
                        }
                }
                }
            }
            return count;
        }
    }

//6.(LC no:189)Rotate Array:
    class Solution {
        public void rotate(int[] nums, int k){
            k%=nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
        public static void reverse(int[] nums,int left,int right){
            while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
            }
        }
    }

//7.(LC no:121)Best Time to Buy and Sell Stock:
    class Solution {
        public int maxProfit(int[] prices) {
            int min=Integer.MAX_VALUE;
            int max=0;
            for(int p:prices){
                if(p<min){
                    min=p;
                }else{
                    max=Math.max(max,p-min);
                }
            }
            return max;
        }
    }

//8.(LC no:122)Best Time to Buy and Sell Stock II:
    class Solution {
        public int maxProfit(int[] prices) {
            int profit=0;
            for(int i=1;i<prices.length;i++){
                if(prices[i-1]<prices[i]){
                    profit=profit+prices[i]-prices[i-1];
                }
            }
            return profit;
        }
    }

//9.(LC no:55)Jump Game:
    class Solution {
        public boolean canJump(int[] nums) {
            int g=nums.length-1;
            for(int i=nums.length-2;i>=0;i--){
                if(i+nums[i]>=g){
                    g=i;
                }
            }return g==0;
        }
    }