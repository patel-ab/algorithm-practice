class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {

    int left = 0;
    int right = 0;
    int result = 0;

    while (right < nums.length) {

      if (nums[right] == 1)
        right += 1;
      else {
        result = Math.max(result, right - left);
        left = right + 1;
        right += 1;
      }

    }

    return Math.max(result, right - left);

  }
}