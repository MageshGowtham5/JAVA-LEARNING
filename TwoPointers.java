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
//2.(LC no:167)Two Sum II - Input Array Is Sorted:
    class Solution {
        public int[] twoSum(int[] n, int target) {
            int l=0,r=n.length-1;
            while(l<r){
                if(n[l]+n[r]==target){
                    return new int[]{l+1,r+1};
                }
                else if(n[l]+n[r]<target){
                    l++;
                }else{
                    r--;
                }
            }return new int[]{-1,-1};
        }
    }
//3.(LC no:11)Container With Most Water:
    class Solution {
        public int maxArea(int[] h) {
            int left=0,right=h.length-1,max=0;
            while(left<right){
                max=Math.max(max,Math.min(h[left],h[right])*(right-left));
                if(h[left]<h[right]){
                    left++;
                }
                else{
                    right--;
                }
            }return max;
        }
    }
//4.(LC no:15)3Sum:
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int target=0;
            Arrays.sort(nums);
            Set<List<Integer>> s=new HashSet<>();
            List<List<Integer>> op=new ArrayList<>();
            for(int i=0;i<nums.length-2;i++){
                int j=i+1;
                int k=nums.length-1;
                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==target){
                        s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                    }
                    else if(sum<target){
                        j++;
                    }else{
                        k--;
                    }
                }
            }op.addAll(s);
            return op;
        }
    }