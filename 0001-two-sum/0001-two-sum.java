class Solution {
    public int[] twoSum(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int x = i + 1; x < n; x++) {

                if (arr[i] + arr[x] == target) {
                    return new int[] {i, x};
                }
            }
        }

        return new int[] {};
    }
}