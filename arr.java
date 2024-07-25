import java.util.ArrayList;

public class arr {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("Abdul Mustafa");
    list.add("Arshad Raza");
    list.add("Arshad");

    //System.out.println("Students are: "+ list.get(1));
    for (String Students:list){
      System.out.println(Students);
    }
  }
}
