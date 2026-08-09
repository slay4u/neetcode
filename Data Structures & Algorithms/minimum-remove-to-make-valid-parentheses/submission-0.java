class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' && s.charAt(i) != ')') sb.append(s.charAt(i));
            else if (s.charAt(i) == '(') {
                sb.append(s.charAt(i));
                count++;
            }
            else if (s.charAt(i) == ')') {
                if (count == 0) continue;
                else {
                    sb.append(s.charAt(i));
                    count--;
                }
            }
        }
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && count != 0) {
                sb.deleteCharAt(i);
                count--;
            }
        }
        return sb.toString();
    }
}