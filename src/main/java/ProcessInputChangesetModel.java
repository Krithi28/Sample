import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Date;

public class ProcessInputChangesetModel {

    public void values(String category, String changeset, String ticket, String doc, String comments) {

        // changeset-id generation
        Date d = new Date();
        Object a = d.getTime();

        try {

            //Connect to MongoDB
            Mongo mongo = new Mongo("10.0.77.216", 27017);

            //Get database, if database doesn't exists, MongoDB will create it for you
            DB db = mongo.getDB("zentooldb");

            // Get collection / table, if collection doesn't exists, MongoDB will create it for you
            DBCollection table = db.getCollection("addcontent");

            // create a document to store key and value
            BasicDBObject document = new BasicDBObject();
            document.put("id", a);
            document.put("category", category);
            document.put("changeset", changeset);
            document.put("ticket", ticket);
            document.put("wiki-documentation", doc);
            document.put("comments", comments);
            table.insert(document);

            System.out.println(table);
            System.out.println(table.find());
            System.out.println(document);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

}

