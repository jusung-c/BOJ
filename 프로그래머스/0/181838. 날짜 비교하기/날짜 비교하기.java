import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {     
        // if (date1[0] < date2[0]) return 1;
        // if (date1[0] == date2[0] && date1[1] < date2[1]) return 1;
        // if (date1[1] == date2[1] && date1[2] < date2[2]) return 1;
        // return 0;
        
        
        
        return Arrays.compare(date1, date2) < 0 ? 1:0;
        
    }
}