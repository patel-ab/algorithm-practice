class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            sb.append(reverse(words[i]));
            if(i < words.length-1) sb.append(" ");
        }
        return sb.toString();
    }

    public String reverse(String word){
        char[] ch = word.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
}