class Solution {
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    int result = 0;

    for (int i : nums) {
      if (i < k)
        result += 1;
    }

    for (int i = 0; i < nums.length - 1; i++) {
      int product = nums[i];
      for (int j = i + 1; j < nums.length; j++) {

        product = product * nums[j];

        if (product < k) {
          result += 1;
        } else {
          break;
        }

      }

    }
    return result;

  }
}

class Solution2 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       if (k <= 1) return 0;
        int i=0;
        int j =0;
        int p =1;
        int count=0;
        while(j<nums.length){
            p=p*nums[j];
            while(p>=k){
                p=p/nums[i];
                i++;
            }
            count=count+(j-i+1);

           j++;

        }
        return count;
    }
    }