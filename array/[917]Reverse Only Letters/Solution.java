class Solution {
    public String reverseOnlyLetters(String S) {
        byte[] bytes = S.getBytes();
        for (int i = 0, j = bytes.length - 1; i < j; ) {
            if (!isLetter(bytes[i])) i++;
            else if (!isLetter(bytes[j])) j--;
            else swap(bytes, i++, j--);
        }
        return new String(bytes);
    }

    private boolean isLetter(byte b) {
        return (65 <= b && b <=90) || (97 <= b && b <= 122);
    }

    private void swap(byte[] bytes, int a, int b) {
        byte temp = bytes[a];
        bytes[a] = bytes[b];
        bytes[b] = temp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = s.reverseOnlyLetters("Test1ng-Leet=code-Q!");
        String str = "Qedo1ct-eeLg=ntse-T!";
        System.out.println(s1.equals(str));
    }
}
