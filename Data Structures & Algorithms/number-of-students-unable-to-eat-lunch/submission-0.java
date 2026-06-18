class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer> stud = new ArrayList<>(Arrays.stream(students).boxed().toList());
        List<Integer> sand = new ArrayList<>(Arrays.stream(sandwiches).boxed().toList());
        int i = 0;
        while (i < stud.size()) {
            if (stud.getFirst() == sand.getFirst()) {
                stud.removeFirst();
                sand.removeFirst();
                i = 0;
            } else {
                Integer temp = stud.getFirst();
                stud.removeFirst();
                stud.addLast(temp);
                i++;
            }
        }
        return stud.size();
    }
}