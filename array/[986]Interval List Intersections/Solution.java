class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0, j = 0, count = 0, max, min;
        int len = Math.max(A.length, B.length);
        int[][] res = new int[len * 2][2];

        while (i < A.length && j < B.length) {
            min = Math.max(A[i][0], B[j][0]);
            if (A[i][1] < B[j][1]) {
                max = A[i++][1];
            } else {
                max = B[j++][1];
            }

            if (min <= max) {
                res[count][0] = min;
                res[count][1] = max;
                count++;
            }
        }
        res = Arrays.copyOf(res, count);
        return res;
    }
}
