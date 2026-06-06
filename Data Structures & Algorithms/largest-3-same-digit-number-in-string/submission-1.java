class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) == num.charAt(i + 1)) count++;
            else count = 1;
            if (count == 3 && sb.length() == 0) {
                sb.append(num.charAt(i)).append(num.charAt(i)).append(num.charAt(i));
                count = 1;
            }
            if (count == 3 && sb.length() > 0) {
                count = 1;
                if (Integer.parseInt(String.valueOf(num.charAt(i))) > Integer.parseInt(String.valueOf(sb.charAt(0)))) {
                    sb.setLength(0);
                    sb.append(num.charAt(i)).append(num.charAt(i)).append(num.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}