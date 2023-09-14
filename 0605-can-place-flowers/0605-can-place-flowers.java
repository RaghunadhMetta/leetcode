class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n <= 1;
        }
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {

            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        count = count + 1;
                        i = i + 2;
                        continue;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        count = count + 1;
                        i = i + 2;
                        continue;
                    }
                } else if (flowerbed[i - 1] == 0 &&
                        flowerbed[i + 1] == 0) {
                    count = count + 1;
                    i = i + 2;
                    continue;
                }
            }
            i = i + 1;
        }
        System.out.println(count);
        return count >= n;
    }
}