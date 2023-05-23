import java.util.*;
public class CountTheCharacters {
        public static void main(String[] args) {
                System.out.print(getCount("umeaylnlfd", 2));
        }

        static int getCount (String s, int N)
        {
                // your code here
                HashMap<Character, Integer> map = new HashMap<>();

                for(int i = 0; i < s.length(); i++){
                        if(map.containsKey(s.charAt(i))){
                                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                        }
                        else{
                                map.put(s.charAt(i), 1);
                        }
                }

                int ans = 0;
                for (int temp : map.values()){
                        if(temp == N){
                                ans++;
                        }
                }
                return ans;
        }
}
