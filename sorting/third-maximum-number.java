class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long Secmax = Long.MIN_VALUE;
        long Thrdmax = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == max || num == Secmax || num == Thrdmax) {
                continue;
            }

            if (num > max) {
                Thrdmax = Secmax;
                Secmax = max;
                max = num;
            }
            else if (num > Secmax) {
                Thrdmax = Secmax;
                Secmax = num;
            }
            else if (num > Thrdmax) {
                Thrdmax = num;
            }
        }

        if (Thrdmax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) Thrdmax;
    }
}