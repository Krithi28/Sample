/**
 * Created by 441691 on 12/19/2014.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class settingProperties {
    public static void main(String[] args) {

        Properties prop = new Properties();
        OutputStream output = null;

        try {

            output = new FileOutputStream("config.properties");

            // set the properties value
            prop.setProperty("ChangesetInformation.json", "C:\\Users\\441691\\IdeaProjects\\JettyProject\\src\\main\\java\\ChangesetInformation.json");
            // save properties to project root folder

            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}