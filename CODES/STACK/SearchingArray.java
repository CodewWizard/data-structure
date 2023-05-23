import java.util.Scanner;

//Searching specific elements in array
public class SearchingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int Searching[]=new int[num];

        for(int i=0; i<num ;i++)
        {
            Searching[i] = sc.nextInt();
        }

        int x=sc.nextInt();
        for(int i=0;i<=x;i++){
            if(Searching[i] == x){
                System.out.println(Searching[i]);
            }
        }
    }
}