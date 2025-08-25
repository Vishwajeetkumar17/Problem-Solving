class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int st : stones){
            pq.offer(st);
        }
        while(pq.size() >= 2){
            int fir = pq.poll();
            int sec = pq.poll();
            if(fir - sec > 0) pq.offer(fir-sec);
        }
        return (!pq.isEmpty()) ? pq.poll() : 0;
    }
}