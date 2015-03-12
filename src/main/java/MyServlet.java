import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class MyServlet
 */
//@WebServlet(description = "test servlet", urlPatterns = { "/MyServlet" })
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String info = request.getParameter("info") ;
        PrintWriter out = response.getWriter() ;
        out.println("<html>") ;
        out.println("<head><title>Hello Servlet</title></head>") ;
        out.println("<body>") ;
        out.println("<h1>" + info + "</h1>") ;
        out.println("</body>") ;
        out.println("</html>") ;
        out.close() ;

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }


}