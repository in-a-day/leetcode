package club.margay;

class Solution {
    public int hIndex(int[] citations) {
        // 直接排序, 找到第一个元素与其后元素长度相等的值
        int[] count = new int[citations.length + 1];
        int bigThanCurr = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <= citations.length) {
                count[citations[i]]++;
            } else {
                bigThanCurr++;
            }
        }
        for (int i = count.length - 1; i >= 0; i--) {
            bigThanCurr += count[i];
            if (i == bigThanCurr) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{3, 0, 6, 1, 5};
        System.out.println(s.solution(a));
    }
}