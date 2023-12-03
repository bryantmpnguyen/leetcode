class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /**
            1 <= flowerbed.length <= 2 * 104
            flowerbed[i] is 0 or 1.
            There are no two adjacent flowers in flowerbed.
            0 <= n <= flowerbed.length
         */

        int placableCount = 0;

        for (int i = 0; i < flowerbed.length; i++ ) {

            if (isNonZero(flowerbed[i]))
                continue;

            if (i-1 >= 0 && isNonZero(flowerbed[i-1]))
                continue;

            if (i+1 < flowerbed.length && isNonZero(flowerbed[i+1]))
                continue;

            flowerbed[i] = 1;
            placableCount++;
        }

        return n <= placableCount;
    }

    public boolean isNonZero(int num) {
        return num != 0;
    }
}