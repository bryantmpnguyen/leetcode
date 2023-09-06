/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.

 */

 /**
  * e.g.

  nums = [ 1, 5, 32, 3 ,0, 2 ,1 , 1, 2, 7]
  val = 1

  then k=7 (remaining)
  nums = [5,32,3,0,2,2,7, 1,1,1]
  */


/**
 * My Approach:
 * Single pointer starting at the end since we want all the "val" targets to end up at the end of the array.
 * I start "k" to be equal to the highest index of the array to denote that all values are currently not "val" associated since no traversing yet.
 * Everytime a "val" is found, the k value decrements AFTER swapping the current k-index value with the val-index value, indicating that the previous k-index
 * is LOCKED for swap access since we're moving all the "val" targets to the end.
 */
class Solution {
    public int removeElement(int[] nums, int val) {
      if (nums.length == 0) {
        return 0;
      }


      int k = nums.length - 1;

      for (int i = k; i >= 0; i--) {
        if (nums[i] == val) {
          copySwitch(nums, i, k);
          k--;
        }
      }

      return k+1;

        
    }

    public void copySwitch(int[] nums, int at, int to) {
      int copyAt = nums[at];
      nums[at] = nums[to];
      nums[to] = copyAt;
    }
}