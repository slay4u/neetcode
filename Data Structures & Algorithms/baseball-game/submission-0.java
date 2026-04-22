class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String s : operations) {
            switch(s) {
                case "+":
                    list.add(list.get(list.size()-1) + list.get(list.size()-2));
                    break;
                case "D":
                    list.add(list.get(list.size()-1)*2);
                    break;
                case "C":
                    list.remove(list.size()-1);
                    break;
                default: list.add(Integer.parseInt(s));
            }
        }
        return list.stream().mapToInt(a -> a).sum();
    }
}