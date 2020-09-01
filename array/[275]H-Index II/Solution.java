class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int l = 0, r = len, mid;
        while (l <= r) {
            mid = (l + r) >> 1;
            if (citations[mid] == len - mid) return citations[mid];
            else if (citations[mid] < len - mid) l = mid + 1;
            else r = mid - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{0, 1, 3, 5, 6};
        System.out.println(s.hIndex(a));
    }
}