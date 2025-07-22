class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 1)
      return 1;

    int i = 1;
    int j = 1;

    while (j < nums.length) {

      if (nums[j] == nums[i - 1]) {
        j += 1;
      } else {
        nums[i] = nums[j];
        i += 1;
        j += 1;

      }
    }
    return i;

  }
}