class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] arr = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both sorted arrays
        while (i < n && j < m) {

            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of nums1
        while (i < n) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements of nums2
        while (j < m) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        // Calculate median
        int total = n + m;

        if (total % 2 == 1) {
            return arr[total / 2];
        } else {
            return (arr[total / 2 - 1] + arr[total / 2]) / 2.0;
        }
    }
}