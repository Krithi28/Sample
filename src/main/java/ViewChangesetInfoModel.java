import com.mongodb.*;

import java.util.*;

/**
 * Created by 441691 on 1/13/2015.
 */
public class ViewChangesetInfoModel {

    ArrayList<String> elementslist = new ArrayList<String>();

    public List<String> values(String other) {

        try {

            //Connect to MongoDB
            Mongo mongo = new Mongo("10.0.77.70", 27017);

            // Get database, if database doesn't exists, MongoDB will create it for you
            DB db = mongo.getDB("zentooldb");

            //Get collection / table, if collection doesn't exists, MongoDB will create it for you
            DBCollection table = db.getCollection("addcontent");

            BasicDBObject query = new BasicDBObject();
            BasicDBObject field = new BasicDBObject();

            field.put("category", 1);
            field.put("changeset", 1);
            field.put("ticket", 1);
            field.put("wiki-documentation", 1);
            field.put("id", 1);
            field.put("comments", 1);

            DBCursor cursor = db.getCollection(String.valueOf(table)).find(query, field);

            while (cursor.hasNext()) {
                BasicDBObject dbObject = (BasicDBObject) cursor.next();
                if (dbObject.getString("category").contains(other)) {
                    // for (int i = 0; i < obj.size(); i++) {
                    elementslist.add(0, dbObject.getString("id"));
                    elementslist.add(1, (String) dbObject.get("category"));
                    elementslist.add(2, (String) dbObject.get("changeset"));
                    elementslist.add(3, (String) dbObject.get("ticket"));
                    elementslist.add(4, (String) dbObject.get("wiki-documentation"));
                    if(dbObject.get("comments")==null || dbObject.get("comments")=="")
                        elementslist.add(5, "N/A");
                    else
                        elementslist.add(5, (String) dbObject.get("comments"));
                    // }
                }
                System.out.println("Object:" + dbObject);
                System.out.println("Id:" + dbObject.get("id"));
                System.out.println("Category:" + dbObject.get("category"));
                System.out.println("Changeset:" + dbObject.get("changeset"));
                System.out.println("Ticket:" + dbObject.get("ticket"));
                System.out.println("Wiki-documentation:" + dbObject.get("wiki-documentation"));
                System.out.println("Comments:" + dbObject.get("comments"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return elementslist;
    }
}