
import Implementation.RetrieveCategory;
import org.json.JSONObject;

import java.io.*;
import java.util.Date;
import java.util.Properties;


public class createoraddcontent {

    InputStream input = null;

    //InputStream jsonFilePath= RetrieveValuesWritetoJsonModel.class.getResourceAsStream("ChangesetInformation.json");

    // private static final String jsonFilePath = "C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\ChangesetInformation.json";

    private static File fileJson = new File("C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\testing.json");

public static void main(String args[])
{

    createJsonStructure();

}


    //If do not exists json file, then i create with basic structure for insert the itens.

    public static void createJsonStructure(){
        if(!fileJson.exists()){
            try {
                fileJson.createNewFile();

                String jsonString = "{\"Results\":{}}";

                writeJsonFile(fileJson, jsonString);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void values(String category, String changeset, String ticket, String doc) {

        // changeset-id generation

        Date d = new Date();
        Object a = d.getTime();

        Properties prop = new Properties();
        InputStream input = null;

        /*try {
            input = new FileInputStream("config.properties");
            // load a properties file
            prop.load(input);

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



        // JSONObject

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",a);
            jsonObject.put("category", category);
            jsonObject.put("changeset", changeset);
            jsonObject.put("ticket", ticket);
            jsonObject.put("wiki-documentation", doc);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try{
            // writing content to jsonfile

            FileWriter jsonFile = new FileWriter(fileJson, true);
            BufferedWriter bufferWritter = new BufferedWriter(jsonFile);
            //3333

            // json
            // bufferWritter.write("\n"  + "\"" + a.toString() + "\"" + " : " );
            bufferWritter.write("\n" + jsonObject.toString() + " ] " + " } ");
            bufferWritter.close();

            RetrieveCategory sendcategory=new RetrieveCategory();
            // sendcategory.getCategory(category);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Open the json file to get the string format, and prepare to insert a new item

    public static String getStringFromFile (String filePath) throws Exception {
        File fl = new File(filePath);
        FileInputStream fin = new FileInputStream(fl);
        String ret = convertStreamToString(fin);
        //Make sure you close all streams.
        fin.close();
        return ret;
    }
    public static String convertStreamToString(InputStream is) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }


    //Writes into the json file that already exists

    public static void writeJsonFile(File file, String json)
    {
        BufferedWriter bufferedWriter = null;
        try {

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(json);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }




}
