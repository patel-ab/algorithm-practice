class Solution {
    public void sortColors(int[] nums) {

      Map<Integer,Integer> map = new HashMap<>();

      for (int i : nums){
        map.put(i, map.getOrDefault(i,0)+1);
      }

      int i =0;

      int red = map.getOrDefault(0,0);
      int white =map.getOrDefault(1,0);
      int blue = map.getOrDefault(2,0);

      while(i < red){
        nums[i] = 0;
        i+=1;
      }
        
      while(i < red + white){
        nums[i] = 1;
        i+=1;
      }
      
      while(i < red+ white + blue){
        nums[i] = 2;
        i+=1;
      }
    }
}

class Solution2 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i=0, k=0, j = n-1;
        while(k<=j){
            if(nums[k]==0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;
            }
            else if(nums[k]==2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
            }
            else{
                k++;
            }
        }
    }
}