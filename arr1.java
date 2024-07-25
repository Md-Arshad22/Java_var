import java.util.List;

public class arr1 {
  
  public static void main(String[] args) 
  {
    // Sample data (replace with your actual data)
    List<String> names = List.of("Apple", "Banana", "Cherry","orange");
    int[] quantities = {10, 20, 30,40};

    System.out.println("Fruits\tQuantity");
    System.out.println("-------\t-------");
    
    for (int i = 0; i < names.size(); i++) 
    {
      System.out.printf("%-10s\t%d\n", names.get(i), quantities[i]);
    }
  }
}
