class Solution {
  public int countGoodSubstrings(String s) {

    Set<Character> set = new HashSet<>();

    int result = 0;

    for (int i = 0; i < s.length() - 2; i++) {

      set.clear();

      for (int j = i; j < i + 3; j++) {

        if (!set.contains(s.charAt(j))) {
          set.add(s.charAt(j));
        } else {
          break;
        }
      }

      if (set.size() == 3)
        result += 1;

    }
    return result;

  }
}

class Solution2 {
    public int countGoodSubstrings(String s) {
        int i=0, j=0, count=0;
        while(j<s.length()){
            if(j-i+1==3){
                if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) 
                && s.charAt(i+2) != s.charAt(i)){
                    count++;
                }
                i++;
            }
            j++;
        }
        return count;
    }
