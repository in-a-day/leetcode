class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int i = 0, j = len - 1, count = len - 1;
        while (i <= j) {
            res[count--] = Math.max(A[i] * A[i], A[j] * A[j]);
            if (A[i] * A[i] > A[j] * A[j]) i++;
            else j--;
        }
        return res;
    }
}
