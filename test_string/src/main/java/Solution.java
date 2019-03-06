import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char str[] = s.toCharArray();

        int  i = 0;
        Map<Character,Integer> ma = new HashMap<Character,Integer>();
        for(char c : str){
            if(ma.get(c) ==null){
                ma.put(c,1);
            }else{
                int num = ma.get(c)+1;
                if(c > i){
                    i =num;
                }
                ma.put(c,num);
            }
        }
        return i;
    }

    public static void main(String[] str){
        Solution s= new Solution();
       System.out.println( s.lengthOfLongestSubstring("aaabbbcccdddd"));
    }
}
