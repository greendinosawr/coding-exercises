class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        String zigString = "";
        int zigSize = 2*numRows-2;
        int numCols = (s.length()/(zigSize) + 1) * (numRows-1);
        char[][] zigzag = new char[numRows][numCols];
        
        int x = 0;
        int y = 0;
        boolean isZigZag = false;
        
        for (char c : s.toCharArray()) {
            System.out.println(x + " " + y);
            zigzag[x][y] = c;
            if (!isZigZag) x++;
            else {
                x--;
                y++;
            }
            if (x == 0 || x == numRows-1) isZigZag = !isZigZag;
        }
        
        for (int i = 0; i < zigzag.length; i++) {
            for (int j = 0; j < zigzag[0].length; j++) {
                if (zigzag[i][j] != '\u0000') zigString += "" + zigzag[i][j];
            }
        }
        
        return zigString;
    }
}