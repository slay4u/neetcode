class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0, l = 0, r = people.length - 1;
        while (l <= r) {
            int diff = limit - people[r];
            r--;
            count++;
            if (l <= r && diff >= people[l]) l++;
        }
        return count;
    }
}