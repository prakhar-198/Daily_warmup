class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((stone1, stone2) -> stone2 - stone1);

        for(int stone: stones) {
            maxHeap.add(stone);
        }

        while(!maxHeap.isEmpty()) {   
            int y = maxHeap.poll();
            if(maxHeap.isEmpty()) {    
                return y;
            } else { 
                int x = maxHeap.poll();
                if(x != y) {
                    maxHeap.add(y - x);
                }
            }
        }
        return 0;

    }
}
