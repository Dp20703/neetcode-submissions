class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String word: strs){

            // convert word into char Array
            char[] ch = word.toCharArray();

            // sort the character array
            Arrays.sort(ch);

            // conver to stirng
            String key = new String(ch);

            // add into map key if not exist
            map.putIfAbsent(key,new ArrayList<>());

            map.get(key).add(word);

        }
        return new ArrayList<>(map.values());
    }
}
