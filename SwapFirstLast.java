import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapFirstLast {

    public static List<String> swapFirstLast(List<String> list) {
        if (list == null || list.size() < 2) {
            return list;
        }

        String first = list.get(0);
        String last = list.get(list.size() - 1);

        list.set(0, last);
        list.set(list.size() - 1, first);

        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("hello", "world"));
        System.out.println("Before swap: " + list);
        swapFirstLast(list);
        System.out.println("After swap: " + list);
    }
}
