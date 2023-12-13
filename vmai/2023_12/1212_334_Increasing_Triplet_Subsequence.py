from ast import List


class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        if len(nums) < 3:
            return False
        
        '''
            Constraint:
                O(n) runtime and O(1) space

            Consider using a three different pointers that represent i,j,k.
            k will iterate because k will have to hold the largest value,
            the others will have to fall in between
        '''

        i = float('inf')
        j = float('inf')

        for k in nums:
            if j < k:
                return True
            
            # move "i" along first if need be in priority
            if k <= i:
                i = k
            else: # if i and k are good, then set "j" at this position so on the reprime, the program will validate
                # if by the next time j >= k then set j to the next. We know that "i" still is at the bottom
                j = k
        
        return False