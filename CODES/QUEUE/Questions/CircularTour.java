package CODES.QUEUE.Questions;

public class CircularTour{
    public static void main(String a[]){
        int[] petrol = new int[]{4, 6, 7, 4};
        int[] dist = new int[]{6, 5, 3, 5};

        System.out.println(circularTour(petrol, dist));
    }


    public static int circularTour(int[] petrol, int[] dist){
        int deficit = 0;
        int balance = 0;
        int start = 0;

        for(int i = 0; i < petrol.length; i++){
            balance += petrol[i] - dist[i];

            //if tour is not possible
            if(balance < 0){
                start = i + 1;
                deficit += balance;
                balance  = 0;
            }
        }

        if(deficit + balance >=  0){
            return start;
        }
        else{
            return -1;
        }
    }

}
