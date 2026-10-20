class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    // 5#hello5#world
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int index = 0;
        int prevStep = 0;

        while (index < str.length()) {
            prevStep = index; 

            while (str.charAt(index) != '#') {
                index++;
            }

            int sLength = Integer.parseInt(str.substring(prevStep, index));

            String strToAdd = str.substring(index + 1, index + 1 + sLength);
            result.add(strToAdd);

            index = index + 1 + sLength;
        }

        return result;
    }
}
