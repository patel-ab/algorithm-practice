class Solution {
    public String[] findWords(String[] words) {

      List<String> result = new ArrayList<>();

      String s1 = "qwertyuiop";
      String s2 = "asdfghjkl";
      String s3 = "zxcvbnm";

      for (String s : words){

          boolean upper = false;
          boolean middle = false;
          boolean lower = false;

        for (char ch : s.toLowerCase().toCharArray()){
        
        if (s1.indexOf(ch) >= 0){
           upper = true;
        }
        else if (s2.indexOf(ch) >= 0){
           middle = true;
        }
        else if (s3.indexOf(ch) >= 0){
           lower = true;
        }


        if ((upper && middle) || (middle && lower) || (upper && lower)){
          continue;
      }
           }

           int count = 0;
           if (upper) count+=1;
           if(lower) count+=1;
           if(middle) count+=1;
      
      if(count==1) result.add(s);
        
    }

    return result.toArray(new String[0]);
}
}