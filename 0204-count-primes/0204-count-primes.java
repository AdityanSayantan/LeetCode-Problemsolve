class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
        return 0;
    }

    int[] isCheck = new int[n];
    int count = 0;

    for (int i = 2; i < n; i++) {
        if (isCheck[i] == 0) {
            count++;
            for (int j = 2 * i; j < n; j += i) {
                isCheck[j] = 1;
            }
        }
    }

    return count;
    }
}