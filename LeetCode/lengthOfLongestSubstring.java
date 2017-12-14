class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.contains(c)) {
                int x = list.indexOf(c);
                list = new ArrayList<Character>(list.subList(x+1, list.size()));
            }
            
            list.add(c);
            max = Math.max(max, list.size());
        }
        return max;
    }
}