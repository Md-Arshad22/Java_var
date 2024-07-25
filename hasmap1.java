import java.util.HashMap;
public class hasmap1 {
    public static void main(String[] args) {
    
        HashMap<String, String> map = new HashMap<>();
        map.put("Md", "Arshad");
        map.put("Md", "Zaheer");
        map.put("Zaheer", "Arshad");
            
        System.out.println("name : " + map);
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }   
    }
}
    
