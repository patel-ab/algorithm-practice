class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> fruitMap = new HashMap<>();
        int max = 0;

        int left = 0;
        for(int right = 0; right< fruits.length; right++) {
            
            fruitMap.put(fruits[right], fruitMap.getOrDefault(fruits[right], 0) + 1);

            while (fruitMap.size() > 2) {
                fruitMap.put(fruits[left], fruitMap.get(fruits[left]) - 1);
                if (fruitMap.get(fruits[left]) == 0) fruitMap.remove(fruits[left]);
                left++;
            } 

            max = Math.max(max, right - left +1);
        }

        return max;
    }
}