class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int left = 0;
        int right = 1;
        int result = 0;

        while(right < nums.length){

        if(nums[right] > nums[right-1]) right+=1;
        else{
          result = Math.max(result , right-left);
          left = right;
          right+=1;
        }

        }
        return Math.max(result, right - left);
    }
}