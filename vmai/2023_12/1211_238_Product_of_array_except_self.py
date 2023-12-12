class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        '''
            Constraints:
                O(n) runtime
                No division operations
                Bonus: O(1) space excluding output list

                Use tabulation method where the product of this is all to the left of nums[i] and right of it
        '''

        # [1, 1, 1, 1, ...]
        output = [1] * len(nums)

        # [2, 3, 4, 5, ...]
        # [1, 3, 12, 60, ...]
        # calculate left side products
        for i in range(1, len(nums)):
            output[i] *= output[i-1] * nums[i-1]
        
        # [2, 3, 4, 5, ...]
        # [1, 3, 12, 60, ...]
        # iterate from right side to calculate product of the left products
        # i in range of the second to last index to 0 and decrement by 1
        right = nums[-1]
        for i in range(len(nums) - 2, -1, -1):
            output[i] *= right
            right*= nums[i]
        
        return output

        