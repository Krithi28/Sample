package Implementation;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by 441691 on 1/20/2015.
 */
public class RetrieveCategory{

   // private static final String jsonFilePath = "C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\ChangesetInformation.json";
    public Object categoryelements;

    public Object getCategory() {

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("ChangesetInformation.json"));

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
        }



try {
    FileReader reader = new FileReader(prop.getProperty("ChangesetInformation.json"));

    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObj = (JSONObject) jsonParser.parse(reader);

    JSONArray elements= (JSONArray) jsonObj.get("elements");
    Iterator it=elements.iterator();
    while (it.hasNext())
    {
        JSONObject innerObj= (JSONObject)it.next();
        categoryelements= innerObj.get("category");
        System.out.println(categoryelements);
    }
    }
catch (Exception ee)
{
    ee.printStackTrace();
}
        return categoryelements;
    }
}
