class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = Integer.toString(num);

        for (int i = 0; i <= s.length() - k; i++) {
            int val = Integer.parseInt(s.substring(i, i + k));
            
            if (val != 0 && num % val == 0) {
                count++;
            }
        }

        return count;
    }
}