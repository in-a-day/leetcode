package club.margay;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>(nums.length);
        for (int num : nums) {
            if (s.contains(num)) return true;
            s.add(num);
        }
        return false;
    }
}