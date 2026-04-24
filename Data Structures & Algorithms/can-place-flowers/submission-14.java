class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        if (flowerbed.length == 1 && flowerbed[0] == 0) return true;
        while (i < flowerbed.length) {
            if ((i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) 
            || (i == flowerbed.length-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0)
            || (i != 0 && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                i++;
                if (n == 0) return true;
                continue;
            } 
            // else if (i == flowerbed.length-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
            //     flowerbed[i] = 1;
            //     n--;
            //     i++;
            //     if (n == 0) return true;
            //     continue; 
            // }
            // else if (i != 0 && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
            //     flowerbed[i] = 1;
            //     n--;
            //     i++;
            //     if (n == 0) return true;
            //     continue;
            // } 
            else i++;
        }
        return n == 0;
    }
}