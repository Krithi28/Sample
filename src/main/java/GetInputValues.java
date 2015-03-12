import java.util.ArrayList;

/**
 * Created by 441691 on 12/30/2014.
 */
public class GetInputValues {

    public void values(String category,String changeset,String ticket,String doc)
    {
        ArrayList ar=new ArrayList();
        ar.add(category);
        ar.add(changeset);
        ar.add(ticket);
        ar.add(doc);
        for(Object o:ar)
            System.out.println(o);
        System.out.println("Over");
    }
}
