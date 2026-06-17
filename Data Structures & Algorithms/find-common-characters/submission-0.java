class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> first = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++)
            first.put(words[0].charAt(i), first.getOrDefault(words[0].charAt(i), 0) + 1);
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> count = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) 
                count.put(words[i].charAt(j), count.getOrDefault(words[i].charAt(j), 0) + 1);
            for (char c : first.keySet()) 
                first.put(c, Math.min(first.get(c), count.getOrDefault(c, 0)));
        }
        List<String> res = new ArrayList<>();
        for (char c : first.keySet()) 
            for (int i = 0; i < first.get(c); i++)
                res.add(String.valueOf(c));
        return res;
    }
}