class Solution {
    public int bestClosingTime(String customers) {

        int pen = 0;
        for (char c : customers.toCharArray())
            if (c == 'Y')
                pen++;

        int best = pen, ans = 0;

        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y')
                pen--;
            else
                pen++;

            if (pen < best) {
                best = pen;
                ans = i + 1;
            }
        }
        return ans;
    }
}
// pen = count of 'Y's = 3  // Y at indices 0,1,3
// best = pen = 3
// ans = 0  // means close at hour 0 initially
// i = 0:

// s.charAt(0) = 'Y'

// pen-- → pen = 2 (avoid penalty for customer at hour 0)

// pen < best? 2 < 3 → YES

// best = 2

// ans = i + 1 = 1 (close at hour 1)

// i = 1:

// s.charAt(1) = 'Y'

// pen-- → pen = 1 (avoid penalty for customer at hour 1)

// pen < best? 1 < 2 → YES

// best = 1

// ans = i + 1 = 2 (close at hour 2)

// i = 2:

// s.charAt(2) = 'N'

// pen++ → pen = 2 (get penalty for being closed when no customer)

// pen < best? 2 < 1 → NO (no change)

// i = 3:

// s.charAt(3) = 'Y'

// pen-- → pen = 1 (avoid penalty for customer at hour 3)

// pen < best? 1 < 1 → NO (not strictly less)

// Return: ans = 2