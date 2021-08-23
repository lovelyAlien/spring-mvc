package spring.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="responseHtmlServlet", urlPatterns="/response-html")
public class ResponseHtmlServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type: text/html;charset=utf-8

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter printWriter= response.getWriter();

        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("   <div>랜더링은 웹 브라우저가 알아서 했으니 걱정말라구!");
        printWriter.println("</body>");
        printWriter.println("</html>");

    }
}
