class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        List<Integer> ticketz = new ArrayList<>(Arrays.stream(tickets).boxed().toList());
        int seconds = 0, index = k;
        while (true) {
            ticketz.set(0, ticketz.getFirst() - 1);
            seconds++;
            if (index == 0 && ticketz.getFirst() == 0) break;
            else if (index == 0 && ticketz.getFirst() != 0) {
                index = ticketz.size() - 1;
                ticketz.addLast(ticketz.getFirst());
                ticketz.removeFirst();
            }
            else if (index != 0 && ticketz.getFirst() == 0) {
                ticketz.removeFirst();
                index--;
            } else {
                ticketz.addLast(ticketz.getFirst());
                ticketz.removeFirst();
                index--;
            }
        }
        return seconds;
    }
}