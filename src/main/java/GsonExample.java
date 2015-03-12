/**
 * Created by 441691 on 2/11/2015.
 */
import java.io.*;
import com.google.gson.Gson;
import org.json.simple.JSONObject;

public class GsonExample {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id", "a");
        jsonObject.put("category", "category");
        jsonObject.put("changeset", "changeset");
        String json = gson.toJson(jsonObject);
        FileWriter writer = new FileWriter("C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\test.json");
        try {
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\test.json"));
           ProcessInputChangesetModel obj=gson.fromJson(br, ProcessInputChangesetModel.class);
            System.out.println(obj);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
