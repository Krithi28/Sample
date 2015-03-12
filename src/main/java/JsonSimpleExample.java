/**
 * Created by 441691 on 12/26/2014.
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

public class JsonSimpleExample {


    private static final String filePath = "C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\test.json";

    public static void main(String[] args) {

        try {

            // read the json file
            //   InputStream is= JsonParseTest.class.getResourceAsStream("jsonTestFile.json");
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONObject id= (JSONObject) jsonObject.get("changeset-id");

            System.out.println(id);

            JSONObject structure=(JSONObject) id.get("1421824691855");
            System.out.println(structure);
            System.out.println(structure.get("category"));

        } catch (Exception e) {

         e.printStackTrace();
        }

    }

}
