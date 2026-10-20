class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>>map = new HashMap<>();
        

        for(int i=0; i<strs.length; i++){
            String stringAtIndex = strs[i];
            HashMap<Character, Integer>freqMap = new HashMap<>();

            for(int j=0; j<stringAtIndex.length();j++){
                freqMap.put(stringAtIndex.charAt(j), freqMap.getOrDefault(stringAtIndex.charAt(j), 0)+1);
            }
            
            if(map.containsKey(freqMap)){
                List<String>str = map.get(freqMap);
                str.add(stringAtIndex);
                map.put(freqMap, str);
            }else{
                List<String>str = new ArrayList<>();
                str.add(stringAtIndex);
                map.put(freqMap, str);
            }
        }

        List<List<String>>ans = new ArrayList<>();

        for(List<String>list: map.values()){
            ans.add(list);
        }
        return ans;
    }
}