class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            StringBuilder str = new StringBuilder();
            int i = 0;
            while (i < s.length() && s.charAt(i) != '@' && s.charAt(i) != '+') {
                if (s.charAt(i) != '.') str.append(s.charAt(i));
                i++;
            }
            while (i < s.length() && s.charAt(i) != '@') i++;
            str.append(s.substring(i));
            set.add(str.toString());
        }
        return set.size();
    }
}