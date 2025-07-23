class Solution {
  public boolean isSubsequence(String s, String t) {

    if (s.length() > t.length())
      return false;

    int i = 0;
    int j = 0;

    while (i < s.length() && j < t.length()) {

      if (s.charAt(i) != t.charAt(j))
        j += 1;
      else {
        i += 1;
        j += 1;
      }

    }

    if (i == s.length())
      return true;
    return false;

  }
}


class Solution2 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char c : t.toCharArray()) {
            if (i == s.length()) {
                return true;
            }
            if (c == s.charAt(i)) {
                i++;
            }
        }
        return i == s.length();
    }
}