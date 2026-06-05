class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        int i = 0, j = 0;
        while (i < ransomNote.length() && j < sb.length()) {
            if (ransomNote.charAt(i) == sb.charAt(j)) {
                i++;
                sb.deleteCharAt(j);
                j = 0;
            } else j++;
        }
        return i == ransomNote.length();
    }
}