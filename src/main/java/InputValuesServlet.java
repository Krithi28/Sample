import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by 441691 on 12/30/2014.
 */
//@WebServlet(name = "inputValuesServlet")
public class InputValuesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        //    HttpSession hs=request.getSession();
        String category=request.getParameter("category");
        String changeset=request.getParameter("changeset");
        String ticket=request.getParameter("ticket");
        String doc=request.getParameter("doc");


        GetInputValues g=new GetInputValues();
        g.values(category,changeset,ticket,doc);

        PrintWriter out= response.getWriter();
        out.println("Done!");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
