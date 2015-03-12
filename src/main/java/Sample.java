
import org.json.JSONObject;

public class Sample {
    public static void main(String[] args) {

        try {
            JSONObject obj = new JSONObject();
            obj.put("name", "mykong.com");
            obj.put("age", new Integer(100));

            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

