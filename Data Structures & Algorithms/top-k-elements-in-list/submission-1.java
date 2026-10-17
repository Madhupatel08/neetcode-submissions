class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((int[] a, int[] b) -> {
            return b[1] - a[1];
        });

        HashMap<Integer, Integer>map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());
        arr.sort((a, b) -> b.getValue() - a.getValue()); 

        int[] ans = new int[k];
        int index = 0;
        while(k-->0){
            ans[index] = arr.get(index).getKey();
            index++;
        }

        return ans;
    }
}
