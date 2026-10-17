class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((int[] a, int[] b) -> {
            return b[1] - a[1];
        });

        HashMap<Integer, Integer>map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num: map.keySet()){
            pq.add(new int[]{num, map.get(num)});
        }

        int[] ans = new int[k];
        int index = 0;
        while(k-->0){
            ans[index] = pq.remove()[0];
            index++;
        }

        return ans;
    }
}
