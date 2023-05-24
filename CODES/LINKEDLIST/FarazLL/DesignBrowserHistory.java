package CODES.LINKEDLIST.FarazLL;

import java.util.Deque;
import java.util.LinkedList;

public class DesignBrowserHistory {
    public static void main(String[] args) {
        Deque<String> l = new LinkedList<>();
        l.addFirst("madiha");
        l.addLast("mujawar");
        l.addFirst("codewizard");
        System.out.println(l);
    }
}
