class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for (String s : words) {
            int i = 0, j = 0;
            StringBuilder sb = new StringBuilder(chars);
            while (i < s.length() && j < sb.length()) {
                if (s.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    i++;
                    j = 0;
                } else j++;
            }
            if (i == s.length()) sum += s.length();
        }
        return sum;
    }
}