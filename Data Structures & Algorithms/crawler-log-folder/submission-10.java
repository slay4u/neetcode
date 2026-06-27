class Solution {
    public int minOperations(String[] logs) {
        int a = 0;
        for (String s : logs) {
            switch(s) {
                case "../": 
                    if (a > 0) a--;
                    break;
                case "./":
                    break;
                default: a++;
            }
        }
        return a;
    }
}