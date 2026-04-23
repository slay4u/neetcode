class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') deque.push(')');
            else if (s.charAt(i) == '[') deque.push(']');
            else if (s.charAt(i) == '{') deque.push('}');
            else if (deque.isEmpty() || deque.pop() != s.charAt(i)) return false;
        }
        return deque.isEmpty();
    }
}