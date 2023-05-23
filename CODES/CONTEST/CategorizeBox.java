public class CategorizeBox {
    public static void main(String[] args) {
        System.out.println(categorizeBox(2909, 3968, 3272, 727));
    }

    public static String categorizeBox(int length, int width, int height, int mass) {
        String both = "Both";
        String bulky = "Bulky";
        String heavy = "Heavy";
        String neither = "Neither";
        long volume = 1L;
        volume = volume * height * width * length;
        System.out.println(volume);

        if((mass >= 100) && (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000)){
            return both;
        }

        else if(mass >= 100){
            return heavy;
        }
        else if(mass  >= 10000|| length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {
            return bulky;
        }

        else{
            return neither;
        }
    }
}
