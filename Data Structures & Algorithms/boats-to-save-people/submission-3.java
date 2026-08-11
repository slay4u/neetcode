class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0, l = 0, r = people.length - 1;
        while (l <= r) {
            if (l <= r && limit - people[r] >= people[l]) l++;
            r--;
            count++;
        }
        return count;
    }
}