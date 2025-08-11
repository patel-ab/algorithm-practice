class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] count = new int[26];

        for(char c : tasks){
            count[c-'A']+=1;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : count){
            
            if (i>0) heap.add(i);
        }


        int time = 0;
        Queue<int[]> q = new LinkedList<>();

        while(!heap.isEmpty() || !q.isEmpty()){
            time+=1;

            if(heap.isEmpty()){
                time = q.peek()[1];
            }else{
                int c = heap.poll()-1;

                if(c>0){
                    q.add(new int[]{c,time+n});
                }
            }
            if (!q.isEmpty() && q.peek()[1] == time) {
                heap.add(q.poll()[0]);
        }
        
    }
    return time;
}
}
