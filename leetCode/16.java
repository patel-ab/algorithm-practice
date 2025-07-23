class Solution {
    public int threeSumClosest(int[] nums, int target) {

      Arrays.sort(nums);
     int result = nums[0] + nums[1] + nums[2];
      
      for (int i=0; i < nums.length-2;i++){

        int j = i+1;
        int k= nums.length-1;

            while(j < k){

               int currentSum = nums[i] + nums[j] + nums[k];

           if (Math.abs(currentSum - target) < Math.abs(result - target)) {
                    result = currentSum;
                }
                 if (currentSum > target) {
                    k--;
                } else if (currentSum < target) {
                    j++;
                } else {
                    // exact match
                    return currentSum;
                }
            
          }

      }
        return result;
    }
}