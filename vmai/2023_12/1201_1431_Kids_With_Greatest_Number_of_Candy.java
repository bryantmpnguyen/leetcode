import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // check if current number of candies with the extra candies is greater than OR EQUAL TO
        // all of the other number of candies from the candies from the parameter array

        // 1) Find max with o(n) runtime
        int maxCandyAmount = -1;
        for (int candyCount : candies) {
            if (candyCount > maxCandyAmount)
                maxCandyAmount = candyCount;
        }

        List<Boolean> isGreatestWithExtraCandies = new ArrayList<Boolean>();
        // 2) O(n) runtime loop with operation
        for (int candyCount : candies) {
            isGreatestWithExtraCandies.add(candyCount + extraCandies >= maxCandyAmount == true);
        }

        return isGreatestWithExtraCandies;

    }
}