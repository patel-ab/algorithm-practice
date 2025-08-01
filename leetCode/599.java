class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {

    Map<String, Integer> map = new HashMap<>();
    int count = 0;
    for (String s : list1) {
      map.put(s, count);
      count += 1;
    }

    List<String> result = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < list2.length; i++) {

      if (map.containsKey(list2[i])) {
        int total = i + map.get(list2[i]);

        if (total == min) {
          result.add(list2[i]);
        }

        else if (total < min) {
          result.clear();
          result.add(list2[i]);
          min = total;
        }
      }
    }

    return result.toArray(new String[0]);

  }

}