class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < words.length; i++) 
            if ("AEIOUaeiou".indexOf(words[i].charAt(0)) != -1 && "AEIOUaeiou".indexOf(words[i].charAt(words[i].length() - 1)) != -1) words[i] = "true";
            else words[i] = "false";
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) 
                if (words[j] == "true") count++;
            res[i] = count;
        }
        return res;
    }
}