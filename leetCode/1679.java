class Solution {
  public int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);

    int i = 0;
    int j = nums.length - 1;
    int result = 0;
    while (i < j) {

      if (nums[i] + nums[j] < k)
        i += 1;
      else if (nums[i] + nums[j] > k)
        j -= 1;
      else {
        result += 1;
        i += 1;
        j -= 1;
      }

    }

    return result;

  }
}