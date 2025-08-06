 class Solution {
  public String reverseVowels(String s) {

    char[] result = s.toCharArray();
    Set<Character> set = new HashSet<>();
    for (char c : "AEIOUaeiou".toCharArray()) {
      set.add(c);
    }

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {

      while (left < right && !set.contains(result[left]))
        left += 1;

      while (left < right && !set.contains(result[right]))
        right -= 1;

      char c = result[left];
      result[left] = result[right];
      result[right] = c;

      left += 1;
      right -= 1;

    }

    return String.valueOf(result); {
    
}
