class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int rest;
        for (int i = 0; i < gas.length; i++) {
            rest = 0;
            for (int j = i; j < gas.length + i; j++) {
                if (rest + gas[j % gas.length] >= cost[j % gas.length]) {
                    rest += gas[j % gas.length] - cost[j % gas.length];
                } else if (j >= gas.length) {
                    return -1;
                } else {
                    i = j;
                    break;
                }
                if (j == gas.length + i - 1) return i;
            }
        }
        return -1;
    }
}
