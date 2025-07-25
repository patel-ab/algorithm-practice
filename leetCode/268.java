class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        int sum = Arrays.stream(nums)
                .sum();

        return expectedSum - sum;
    }
}