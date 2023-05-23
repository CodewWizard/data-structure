package OTHERS;

public class NumberOfWaysInvitePPl {
    public static void main(String[] args) {
        System.out.println(callGuest(3));
    }

    public static int callGuest(int n){
        if(n <= 1){
            return 1;
        }

        // if we call person as a single
        int way1 = callGuest(n - 1);

        //if we call two persons as a pair
        int way2 = callGuest(n - 2);

        return way1 + way2;
    }
}
