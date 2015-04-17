import org.codehaus.plexus.util.StringUtils;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

/**
 * Created by 441691 on 1/7/2015.
 */
public class ViewChangesetInfoServlet extends HttpServlet {

    private static final String OTHER = "other";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String other = request.getParameter(OTHER);
        request.getRequestDispatcher("/ViewTable.jsp").include(request, response);
        ViewChangesetInfoModel view = new ViewChangesetInfoModel();
        if (StringUtils.isNotBlank(other))
            view.values(other);

        PrintWriter out = response.getWriter();

        request.setAttribute("elementslist", view.elementslist.toArray());
        out.println("<html>");
        out.println("<head>");

        out.println("<link rel='stylesheet' href='styles/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='styles/bootstrap-theme.min.css'>");
        out.println("<script src='scripts/jquery.min.js'></script>");
        out.println("<script src='scripts/bootstrapmin.js'></script>");
        out.println("<link rel='stylesheet' type='text/css' href='styles/textbox.css'>");
        out.println("</head>");

        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<P ALIGN='center'><table class='table-striped table-bordered table-condensed'");
        out.print("<tr>" + "<th>" + "Id" + "</th>" + "<th>" + "Category" + "</th>" + "<th>" + "Changeset" + "</th>" + "<th>" + "Ticket" + "</th>" + "<th>" + "Wiki-documentation" + "</th>" + "<th>" + "Comments" + "</th>" + "</tr>");
        int i = 0;
        out.print("<tr>");
        while (i < view.elementslist.size()) {
            out.print("<td>" + view.elementslist.toArray()[i]);
            i++;

            if (i % 6 == 0) {
                out.print("</tr>" + "<tr>");
            }

        }
        out.print("</tr>");
        out.println("</table> </P>");

        out.println("</body>");
        out.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
