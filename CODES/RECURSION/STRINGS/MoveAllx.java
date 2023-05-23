package STRINGS;

public class MoveAllx {
        public static void main(String[] args) {
                move("mxaxxdxxixhax", 0, 0, "");
        }

        public static void move(String str, int index, int count, String ans){
                if(index == str.length()){
                        for (int i = 0; i < count; i++) {
                                ans += 'x';
                        }
                        System.out.println(ans);
                        return;
                }

                if(str.charAt(index) == 'x'){
                        count++;
                        move(str, index + 1, count, ans);
                }
                else{
                        ans += str.charAt(index);
                        move(str, index + 1, count, ans);
                }
        }
}
