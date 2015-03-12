import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import sun.org.mozilla.javascript.internal.json.JsonParser;

import java.io.*;
import java.text.ParseException;
import java.util.*;

/**
 * Created by 441691 on 1/19/2015.
 */
public class propertiesfile {

    public static final String filepath="C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\JsonContent.json";
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(filepath));

            JSONObject jsonObject =  (JSONObject) obj;

            String name = (String) jsonObject.get(String.valueOf(0));
            System.out.println(name);


           /* JSONArray msg = (JSONArray) jsonObject.get(1);

            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }*/



        }
        catch (Exception e) {
            e.printStackTrace();
        }

       /* Properties prop = new Properties();
        InputStream input = null;
        OutputStream output = null;

        JSONObject jsonObject = new JSONObject();


            jsonObject.put("category", "category1");
            jsonObject.put("other", "other1");
            System.out.println(jsonObject);


        Set keys = jsonObject.keySet();
        Iterator a = keys.iterator();
        while(a.hasNext()) {
            String key = (String)a.next();
            // loop to get the dynamic key
            String value = (String)jsonObject.get(key);
            System.out.print("key : "+key);
            System.out.println(" value :"+value);
        }*/
     /*   final JsonParser parser = new JsonParser();
        final JsonElement jsonElement = parser.parse(new FileReader("/path/to/myfile"));
        final JsonObject jsonObject = jsonElement.getAsJsonObject();

        for (final Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            final String key = entry.getKey();
            final JsonElement value = entry.getValue();
        }*/

       /* try {

            output = new FileOutputStream("JsonContent.json");

            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                System.out.println("Key : " + key + ", Value : " + value);
            }
            // save properties to project root folder
            prop.store(output, null);
            System.out.print(prop);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

    }


}
