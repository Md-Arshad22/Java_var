import java.util.ArrayList;

public class arr2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("two");
        list.add(3);
        list.add("four");
        list.add(5);
        
        for (Object element : list) {
           System.out.println(element);
        }
    }
}
