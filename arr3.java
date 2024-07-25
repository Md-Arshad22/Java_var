import java.util.ArrayList;

public class arr3 {
    public static void main(String[] args) {
                                                      
        ArrayList<String> list=new ArrayList<>();
        list.add("Zaheer");
        list.add("Arshad");
        list.add("Ahmed");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        
    // System.out.println("students are: " + list.get(1));
    for (String students:list)
    {
        System.out.println(students);
    }
    for (Integer students:list1)
    {
        System.out.println(students);
    }
          
    }
}
