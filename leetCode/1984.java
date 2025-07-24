class Solution {
  public int minimumDifference(int[] nums, int k) {

    Arrays.sort(nums);

    int diff = nums[k - 1] - nums[0];

    for (int i = 1; i <= nums.length - k; i++) {

      diff = Math.min(diff, nums[i + k - 1] - nums[i]);
    }
    return diff;

  }
}
