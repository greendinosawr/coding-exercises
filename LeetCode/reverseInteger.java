class Solution {
    public int reverse(int x) {
        String s = x + "";
        int isNeg = 1;
        long r = 0;
        
        if (x < 0) {
            s = s.substring(1);
            isNeg = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            r += Character.getNumericValue(s.charAt(i))*Math.pow(10, i);
        }
        
        if (x < 0) r *= isNeg;
        
        return r < Math.pow(2, 31)-1 && r > Math.pow(-2, 31) ? (int)r : 0;
    }
}