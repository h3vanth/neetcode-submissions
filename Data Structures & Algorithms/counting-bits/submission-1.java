class Solution {
    public int[] countBits(int n) {
        /*
            DP
            0000 -> 0
            0001 -> 1 + output[1 - 1]
            0010 -> 1 + output[2 - 2]
            0011 -> 1 + output[3 - 2]
            0100 -> 1 + output[4 - 4]
            0101 -> 1 + output[5 - 4]
            0110 -> 1 + output[6 - 4]
            0111 -> 1 + output[7 - 4]
            1000 -> 1 + output[8 - 8]
            1001 -> 1 + output[9 - 8]
            ...
        */
        int[] output = new int[n + 1];
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                offset = i;
            }
            output[i] = 1 + output[i - offset];
        }
        return output;
    }
}
