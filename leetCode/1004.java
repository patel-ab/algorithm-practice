class Solution {
  public int longestOnes(int[] nums, int k) {

    int result = 0;
    int left = 0;
    int[] arr = new int[2];

    for (int right = 0; right < nums.length; right++) {

      arr[nums[right]] += 1;

      while (arr[0] > k) {
        arr[nums[left]]--;
        left++;
      }
      result = Math.max(result, right - left + 1);

    }
    return result;

  }
}