class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int findsquare(int number) {
        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }

        return ans;
    }
}