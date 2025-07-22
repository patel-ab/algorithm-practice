class Solution {
  public void moveZeroes(int[] nums) {

    int i = 0;
    int j = 0;

    while (j < nums.length) {

      if (nums[j] != 0) {
        nums[i] = nums[j];
        i += 1;
        j += 1;
      } else {
        j += 1;
      }

    }

    while (i < nums.length) {
      nums[i] = 0;
      i += 1;
    }

  }
}