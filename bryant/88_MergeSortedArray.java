class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // I put this in to handle an edge case that ended up getting handled by the 2nd/3rd while loops.
        // if (m == 0) {
        //     for (int i = 0; i < n; i++) {
        //         nums1[i] = nums2[i];
        //     }
        // }
        
        int mPointer = m - 1;
        int nPointer = n - 1;
        int nextLargestIndex = m + n - 1;

        /**
        Keep pointers on nums1 and nums2, starting at the end of the elements. These are X and Y respectively.
        Also, let Z be a separate pointer on nums1, starting at the very end of the list after the zeros.
        Compare the elements at nums1[X] and nums2[Y].
        Whichever is greater, insert into nums1[Z].
        Then, decrement Z.
        If the element at nums1[X] is greater, decrement X.
        If the element at nums2[Y] is greater, decrement Y.
        Repeat while X > 0 and Y > 0.
         */ 
        while (mPointer >= 0 && nPointer >= 0) {
            if (nums1[mPointer] > nums2[nPointer]) {
                nums1[nextLargestIndex] = nums1[mPointer];
                mPointer--;
            } else {
                nums1[nextLargestIndex] = nums2[nPointer];
                nPointer--;
            }
            nextLargestIndex--;
        }

        while (nPointer >= 0) {
            nums1[nextLargestIndex] = nums2[nPointer];
            nextLargestIndex--;
            nPointer--;
        }

        while (mPointer >= 0) {
            nums1[nextLargestIndex] = nums1[mPointer];
            nextLargestIndex--;
            mPointer--;
        }
    }
}
