/**
 * Created by 441691 on 2/13/2015.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by 441691 on 1/13/2015.
 */
@WebServlet(name = "ProcessInputChangesetInfoServlet")
public class ProcessInputChangesetInfoServlet extends HttpServlet {

    private static final String CATEGORY = "category";
    private static final String CHANGESET = "changeset";
    private static final String TICKET = "ticket";
    private static final String DOC = "doc";
    private static final String COMMENTS = "comments";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Send response to Jsp page for Url Editing
        // request.getRequestDispatcher("/WEB-INF/classes/ProcessInputChangesetInfo.jsp").forward(request, response);
        //  request.getRequestDispatcher("/WEB-INF/classes/ViewChangesetInfo.jsp").forward(request, response);

        try {

            // getting input values
            response.setContentType("text/html;charset=UTF-8");
            String category = request.getParameter(CATEGORY);
            String changeset = request.getParameter(CHANGESET);
            String ticket = request.getParameter(TICKET);
            String doc = request.getParameter(DOC);
            String comments = request.getParameter(COMMENTS);

            // passing values to java class
            ProcessInputChangesetModel retrival = new ProcessInputChangesetModel();
            retrival.values(category, changeset, ticket, doc, comments);

            getServletConfig().getServletContext().getRequestDispatcher("/ViewChangesetInfo.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

