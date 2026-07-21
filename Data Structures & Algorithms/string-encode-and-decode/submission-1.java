class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s.length()).append("#").append(s);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int j = 0;
            while (Character.isDigit(str.charAt(i))) 
                j = j * 10 + str.charAt(i++) - '0';
            j += i += 1;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}