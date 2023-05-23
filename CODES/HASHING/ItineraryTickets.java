import java.util.*;

public class ItineraryTickets {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        System.out.println(tickets(map));
    }

    public static ArrayList<String> tickets(HashMap<String, String> map){
        String start = getStart(map);
        ArrayList<String> ans = new ArrayList<>();

        while (map.containsKey(start)){
            System.out.print(start + " -> ");
            ans.add(start);
            start = map.get(start);
        }
        ans.add(start);

        System.out.print(start+"\n");
        return ans;
    }

    public static String getStart(HashMap<String, String> map){
        HashMap<String, String> reverseMap = new HashMap<>();

        for (String key : map.keySet()) {
            reverseMap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
            if(!reverseMap.containsKey(key))
                return key;
        }
        return null;
    }


}
